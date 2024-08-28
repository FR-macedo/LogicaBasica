package JV;
import java.util.Scanner;
public class ExerciciosMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        //dimensões da matriz
        int linhas = 2;
        int colunas = 4;
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println("Matriz impressa:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        //soma dos elementos da primeira coluna (a)
        int somaPrimeiraColuna = 0;
        for (int i = 0; i < 3; i++) {
            somaPrimeiraColuna += matriz[i][0];
        }
        System.out.println("A soma dos elementos da primeira coluna é: " + somaPrimeiraColuna);

        //produto dos elementos da primeira coluna (b)
        int produtoPrimeiraColuna = 1;
        for (int i = 0; i < 3; i++) {
            produtoPrimeiraColuna *= matriz[i][0];
        }
        System.out.println("O produto dos elementos da primeira coluna é: " + produtoPrimeiraColuna);

        //somatório de todos os elementos da matriz (c)
        int somatorioMatriz = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somatorioMatriz += matriz[i][j];
            }
        }
        System.out.println("O somatório de todos os elementos da matriz é: " + somatorioMatriz);

        // Calcular a soma dos elementos da diagonal principal (d)
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        input.close();
    }
}


