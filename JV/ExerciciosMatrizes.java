package JV;
import java.util.Scanner;

public class ExerciciosMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Primeira matriz de 2x4
        int linhas1 = 2;
        int colunas1 = 4;
        int[][] matriz1 = new int[linhas1][colunas1];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }

        System.out.println("Primeira matriz impressa:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();  // Para pular linha após cada linha da matriz
        }

        // Segunda matriz de 3x3
        int linhas2 = 3;
        int colunas2 = 3;
        int[][] matriz2 = new int[linhas2][colunas2];

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print("Elemento[" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        // Soma dos elementos da primeira coluna (a)
        int somaPrimeiraColuna = 0;
        for (int i = 0; i < linhas2; i++) {
            somaPrimeiraColuna += matriz2[i][0];
        }
        System.out.println("A soma dos elementos da primeira coluna é: " + somaPrimeiraColuna);

        // Produto dos elementos da primeira coluna (b)
        int produtoPrimeiraColuna = 1;
        for (int i = 0; i < linhas2; i++) {
            produtoPrimeiraColuna *= matriz2[i][0];
        }
        System.out.println("O produto dos elementos da primeira coluna é: " + produtoPrimeiraColuna);

        // Somatório de todos os elementos da matriz (c)
        int somatorioMatriz = 0;
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                somatorioMatriz += matriz2[i][j];
            }
        }
        System.out.println("O somatório de todos os elementos da matriz é: " + somatorioMatriz);

        // Calcular a soma dos elementos da diagonal principal (d)
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < linhas2; i++) {
            somaDiagonalPrincipal += matriz2[i][i];
        }
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        input.close();
    }
}
