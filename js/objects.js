// Object creation in JavaScript
let person = {
    name: "John",
    age: 25,
    getName: function() {
        return this.name;
    },
    getAge: function() {
        return this.age;
    }
};

console.log(`${person.getName()} is ${person.getAge()} years old.`);
