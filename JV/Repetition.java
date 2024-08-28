package JV;

public class Repetition {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);
    }
}
