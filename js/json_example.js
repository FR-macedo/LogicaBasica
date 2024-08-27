// Load and parse the JSON data
const jsonData = `{
    "name": "John Doe",
    "age": 30,
    "isStudent": false,
    "skills": ["JavaScript", "Java", "Python"],
    "address": {
        "street": "123 Main St",
        "city": "Anytown",
        "state": "CA"
    },
    "hobbies": [
        {
            "name": "Reading",
            "type": "Educational"
        },
        {
            "name": "Gaming",
            "type": "Entertainment"
        }
    ]
}`;

// Parsing JSON string into a JavaScript object
const parsedData = JSON.parse(jsonData);

// Accessing the data
console.log("Name:", parsedData.name);
console.log("Age:", parsedData.age);
console.log("Is Student:", parsedData.isStudent);
console.log("Skills:", parsedData.skills.join(", "));
console.log("Address:", `${parsedData.address.street}, ${parsedData.address.city}, ${parsedData.address.state}`);
console.log("Hobbies:");
parsedData.hobbies.forEach(hobby => {
    console.log(`- ${hobby.name} (${hobby.type})`);
});

// Converting JavaScript object back to JSON
const jsonString = JSON.stringify(parsedData, null, 2);
console.log("\nConverted back to JSON string:");
console.log(jsonString);
