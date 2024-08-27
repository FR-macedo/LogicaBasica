package java;

public class Objects {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
