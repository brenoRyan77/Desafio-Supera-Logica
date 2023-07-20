package desafio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Número de casos de teste
        scanner.nextLine(); // Consumir a quebra de linha após o inteiro

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            String fraseOriginal = desembaralharString(linha);
            System.out.println(fraseOriginal);
        }
    }

    public static String desembaralharString(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;

        StringBuilder fraseOriginal = new StringBuilder(tamanho);

        // Desembaralha a metade esquerda da linha
        for (int i = meio - 1; i >= 0; i--) {
            fraseOriginal.append(linha.charAt(i));
        }

        // Desembaralha a metade direita da linha
        for (int i = tamanho - 1; i >= meio; i--) {
            fraseOriginal.append(linha.charAt(i));
        }

        return fraseOriginal.toString();
    }
}
