let a = 10;
let b = 20;

// If-else demonstration
if (a > b) {
    console.log("A is greater than B");
} else if (a < b) {
    console.log("A is less than B");
} else {
    console.log("A is equal to B");
}

// Ternary operator demonstration
let result = a > b ? "A is greater" : "A is not greater";
console.log(result);

// Switch case demonstration
let day = 3;
let dayName;

switch (day) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    case 3:
        dayName = "Tuesday";
        break;
    case 4:
        dayName = "Wednesday";
        break;
    case 5:
        dayName = "Thursday";
        break;
    case 6:
        dayName = "Friday";
        break;
    case 7:
        dayName = "Saturday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

console.log(`Day ${day} is ${dayName}`);
