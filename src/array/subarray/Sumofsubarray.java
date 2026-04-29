package array.subarray;

import java.util.Scanner;

public class Sumofsubarray {
    public static void main(String[] args) {

        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create prefix sum array
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        // Print sum of all subarrays
        System.out.println("\nSum of all subarrays:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum;
                if (i == 0) {
                    sum = pref[j];
                } else {
                    sum = pref[j] - pref[i - 1];
                }

                System.out.println("Subarray [" + i + "," + j + "] sum = " + sum);
            }
        }
    }
}
