package desafio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double valor;
        try {
            valor = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido! Certifique-se de usar ponto (.) como separador decimal.");
            return;
        }

        int notas[] = { 100, 50, 20, 10, 5, 2 };
        double moedas[] = { 1.0, 0.5, 0.25, 0.10, 0.05, 0.01 };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
            valor %= moeda;
        }
    }
}
