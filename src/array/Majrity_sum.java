package array;

import java.util.*;

public class Majrity_sum {

        // Function to find majority element
        public static int majorityElement(int[] arr) {
            int n = arr.length;

            // Edge case
            if (n == 1) return arr[0];

            Arrays.sort(arr);
            int freq = 1;

            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    freq++;
                    if (freq > n / 2) {
                        return arr[i];
                    }
                } else {
                    freq = 1;
                }
            }
            return -1;
        }

        // Main method (for IntelliJ input/output)
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Input elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Function call
            int result = majorityElement(arr);

            // Output
            System.out.println("Majority Element: " + result);

            sc.close();
        }
    }

