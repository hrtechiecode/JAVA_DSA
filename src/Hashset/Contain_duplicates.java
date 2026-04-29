package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Contain_duplicates {

    static boolean hashset(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num : arr) {
            if (hash.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return true;  // Stop after first duplicate
            }
            hash.add(num);
        }

        System.out.println("No duplicates found.");
        return false;
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

        hashset(arr);
    }
}
