package java;

public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is less than B");
        } else {
            System.out.println("A is equal to B");
        }

        String result = (a > b) ? "A is greater" : "A is not greater";
        System.out.println(result);
    }
}
