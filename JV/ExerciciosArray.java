package JV;

import java.util.Scanner;

public class ExerciciosArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercício 1: Preencher um array de 5 posições com números inteiros inseridos pelo usuário e imprimir o array.
        int[] array1 = new int[5];
        System.out.println("Exercício 1: Digite 5 números inteiros:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = input.nextInt();
        }
        System.out.println("Você digitou:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Exercício 2: Calcular a soma de todos os elementos de um array de 10 posições.
        int[] array2 = new int[10];
        int soma = 0;
        System.out.println("Exercício 2: Digite 10 números inteiros:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array2[i] = input.nextInt();
            soma += array2[i];
        }
        System.out.println("A soma dos elementos é: " + soma);
        System.out.println();

        // Exercício 3: Encontrar o maior e o menor valor em um array de 8 posições.
        int[] array3 = new int[8];
        System.out.println("Exercício 3: Digite 8 números inteiros:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array3[i] = input.nextInt();
        }
        int maior = array3[0];
        int menor = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > maior) {
                maior = array3[i];
            }
            if (array3[i] < menor) {
                menor = array3[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println();

        // Exercício 4: Contar quantos números pares e ímpares existem em um array de 15 posições.
        int[] array4 = new int[15];
        int pares = 0;
        int impares = 0;
        System.out.println("Exercício 4: Digite 15 números inteiros:");
        for (int i = 0; i < array4.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array4[i] = input.nextInt();
            if (array4[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println();

        // Exercício 5: Inverter os elementos de um array de 6 posições.
        int[] array5 = new int[6];
        System.out.println("Exercício 5: Digite 6 números inteiros:");
        for (int i = 0; i < array5.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array5[i] = input.nextInt();
        }
        System.out.println("Array invertido:");
        for (int i = array5.length - 1; i >= 0; i--) {
            System.out.print(array5[i] + " ");
        }
        System.out.println("\n");

        input.close();
    }
}
