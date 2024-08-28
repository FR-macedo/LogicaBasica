package JV;

public class Variables {
    public static void main(String[] args) {
        int integerVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        String stringVar = "Hello, World!";
        boolean booleanVar = true;

        int[] arrayVar = {1, 2, 3, 4, 5};
        int[] arrayTeste = new int[8];
        int[][] matriz = new int[9][4];
        int[][] matrixVar = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Integer: " + integerVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("String: " + stringVar);
        System.out.println("Boolean: " + booleanVar);

        System.out.print("Array: ");
        for (int i : arrayVar) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Matrix: ");
        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                System.out.print(matrixVar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
