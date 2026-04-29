package array;

import java.util.Arrays;
import java.util.Scanner;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always
public class Majority_element {
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//brute force
//        int mj = n / 2;
//        boolean found = false;
//
//        for (int val : arr) {
//            int freq = 0;
//
//            for (int element : arr) {
//                if (val == element) {
//                    freq++;
//                }
//            }
//
//            if (freq > mj) {
//                System.out.println("Majority element: " + val);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No majority element exists");
//        }

        //optimized
        int mj = n / 2;
        Arrays.sort(arr);

        int freq = 1;
        int ans = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = arr[i];
            }

            if (freq > mj) {
                System.out.println("Majority element: " + ans);
                break;
            }
        }

    }
}
