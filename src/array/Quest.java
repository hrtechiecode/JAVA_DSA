package array;

import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // array input, but not used
        }

        int halfEven = n / 2;
        int halfOdd  = (n + 1) / 2;

        int evenSum = halfEven * (halfEven + 1);
        int oddSum  = halfOdd * halfOdd;

        int result = Math.max(evenSum, oddSum) * m;

        System.out.println(result);
    }
}
