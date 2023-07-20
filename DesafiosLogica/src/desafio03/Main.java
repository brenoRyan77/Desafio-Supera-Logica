package desafio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countParesQueSomaAlvo(arr, k);
        System.out.println(count);
    }

    public static int countParesQueSomaAlvo(int[] arr, int k) {
        Map<Integer, Integer> complementCount = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = k - num;
            if (complementCount.containsKey(complement)) {
                count += complementCount.get(complement);
            }
            complementCount.put(num, complementCount.getOrDefault(num, 0) + 1);
        }

        return count;
    }

}
