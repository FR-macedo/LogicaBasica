// Demonstrating variable declaration with different data types
let integerVar = 10;
let doubleVar = 20.5;
let stringVar = "Hello, World!";
let booleanVar = true;

// Demonstrating that variables in JavaScript can hold any type of data
integerVar = "Now I'm a string!";
doubleVar = [1, 2, 3, 4];
booleanVar = { key: "value" };

console.log("Integer (originally):", 10);
console.log("Integer (changed to string):", integerVar);
console.log("Double:", doubleVar);
console.log("String:", stringVar);
console.log("Boolean (changed to object):", booleanVar);

// Demonstrating arrays and matrices
let arrayVar = [1, 2, 3, 4, 5];
let matrixVar = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("Array:", arrayVar);
console.log("Matrix:");
matrixVar.forEach(row => console.log(row));
