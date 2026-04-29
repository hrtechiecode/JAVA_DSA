package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Twosum {

    static int[] HashmapTwosum(int[] arr, int n, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = target - arr[i];
            if (hash.containsKey(num)) {
                return new int[]{hash.get(num), i};
            } else {
                hash.put(arr[i], i);
            }
        }
        return new int[]{}; // empty array if no solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] result = HashmapTwosum(arr, n, target);

        if (result.length == 0) {
            System.out.println("No pair found that adds up to the target.");
        } else {
            System.out.println("Indices of elements: " + result[0] + " and " + result[1]);
        }

    }
}
