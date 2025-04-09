import express from "express";
import bodyParser from "body-parser";
import { dirname } from "path";
import { fileURLToPath } from "url";
import morgan from "morgan";

const __dirname = dirname(fileURLToPath(import.meta.url));
const app = express();
const port = 3000;

app.use(morgan("combined"));
app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/public/index.html");
});

app.post("/submit", (req, res) => {
  console.log(req.body);
  res.send("<h1>Your bandname is: <h1>" + "<h2>" + req.body.street + req.body.pet + " &#9996;<h2>");
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});
