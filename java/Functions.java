package java;

public class Functions {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum: " + result);

        printMessage("Hello, World!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

