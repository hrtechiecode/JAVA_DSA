package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarray {
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    static int[] inputarray() {
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void subArray(ArrayList<Integer> list) {
        int n = list.size();

        // Generate subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(list.get(k) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        inputarray();

        // Convert int[] to ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }

        subArray(list);
    }
}
