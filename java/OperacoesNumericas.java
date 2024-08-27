package java;

public class OperacoesNumericas {

    // Método para adição
    public double adicionar(double a, double b) {
        return a + b;
    }

    // Método para subtração
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicação
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para divisão
    public double dividir(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Método para módulo (resto da divisão)
    public double modulo(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a % b;
    }

    // Método para exponenciação
    public double exponenciar(double a, double b) {
        return Math.pow(a, b);
    }

    // Método para raiz quadrada
    public double raizQuadrada(double a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Número negativo não tem raiz quadrada real.");
        }
        return Math.sqrt(a);
    }

    // Método principal para testar as operações
    public static void main(String[] args) {
        OperacoesNumericas operacoes = new OperacoesNumericas();

        System.out.println("Adição: " + operacoes.adicionar(5, 3));            // 8
        System.out.println("Subtração: " + operacoes.subtrair(5, 3));          // 2
        System.out.println("Multiplicação: " + operacoes.multiplicar(5, 3));   // 15
        System.out.println("Divisão: " + operacoes.dividir(6, 3));             // 2
        System.out.println("Módulo: " + operacoes.modulo(5, 3));               // 2
        System.out.println("Exponenciação: " + operacoes.exponenciar(2, 3));   // 8
        System.out.println("Raiz Quadrada: " + operacoes.raizQuadrada(16));    // 4
    }
}
