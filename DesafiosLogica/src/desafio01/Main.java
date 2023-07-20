package desafio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        List<Integer> resultado = ordenarParesImpares(valores);

        for (int valor : resultado) {
            System.out.println(valor);
        }
	}

	public static List<Integer> ordenarParesImpares(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(pares);
        resultado.addAll(impares);

        return resultado;
    }
}
