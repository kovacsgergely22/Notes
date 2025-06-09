const weekdays = [1, 2, 3, 4, 5];
const weekends = [6, 7];
const todayDate = new Date().toLocaleDateString();
const today = getDay();
const work = getWork();

function getDay() {
    if (weekdays.includes(todayDate.getDay())) {
        return "Weekday";
    }
    if (weekends.includes(todayDate.getDay())) {
        return "Weekend";
    }
    return "Invalid day";  
}

function getWork() {
    if (weekdays.includes(todayDate.getDay())) {
        return "work hard";
    }
    if (weekends.includes(todayDate.getDay())) {
        return "have fun";
    }
    return "Invalid day";  
}