package array.subarray;

import java.util.Scanner;

public class MaxsumSubarray {
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsumsubarray = Integer.MIN_VALUE;

        // generate all subarrays
        for (int st = 0; st < n; st++) {
            int currsum = 0;
            for (int end = st; end < n; end++) {
                currsum += arr[end];   // calculate subarray sum
                maxsumsubarray = Math.max(maxsumsubarray, currsum);
            }
        }

        System.out.println("Max Subarray Sum = " + maxsumsubarray);
    }
}
