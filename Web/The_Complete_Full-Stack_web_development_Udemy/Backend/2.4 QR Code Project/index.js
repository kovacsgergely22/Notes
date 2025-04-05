import inquirer from 'inquirer';
import qr from 'qr-image';
import fs from 'fs';

/* 
1. Use the inquirer npm package to get user input.
2. Use the qr-image npm package to turn the user entered URL into a QR code image.
3. Create a txt file to save the user input using the native fs node module.
*/

inquirer
    .prompt([
        {
            message: 'Type in your URL: ',
            name: 'URL',
        }
    ])
    .then((answers) => {
        const key = answers.URL;
        var qr_svg = qr.image(key, { type: 'png' });
        var output = fs.createWriteStream('qr_code.png');
        
        qr_svg.pipe(output);
        output.on('finish', () => {
            console.log('QR code image created successfully!');
        });
        fs.writeFile('user_input.txt', key, (err) => {
            if (err) throw err;
            console.log('User input saved to user_input.txt!');
        });

    })
    .catch((error) => {
        if (error.isTtyError) {
            console.log('Prompt couldn\'t be rendered in the current environment');
        } else {
            console.log('An error occurred:', error);
        }
    });