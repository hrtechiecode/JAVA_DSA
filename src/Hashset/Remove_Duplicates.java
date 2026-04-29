package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicates {
    //no duplicates,unordered
    static int[] hashset(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : arr) {
            if (!hash.contains(num)) {
                hash.add(num);
            }
        }
        // Convert HashSet to int[]
        int[] result = new int[hash.size()];
        int i = 0;
        for (int num : hash) {
            result[i++] = num;
        }
        return result;

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
        int[] result = hashset(arr);

        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");

        }
    }
}