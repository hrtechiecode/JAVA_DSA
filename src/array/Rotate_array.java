package array;

import java.util.Scanner;
import java.util.Arrays;

public class Rotate_array {
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] inputarray() {
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    // Reverse subarray from st to end
    static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    // Rotate array using extra space (right rotation)
    static int[] rotateExtra(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) ans[j++] = arr[i];
        for (int i = 0; i < n - k; i++) ans[j++] = arr[i];
        return ans;
    }

    // Left rotation in-place
    static int[] rotateLeftInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    // Right rotation in-place
    static int[] rotateRightInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }

    public static void main(String[] args) {
        inputarray();
        printarray(arr);

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        int[] ansExtra = rotateExtra(arr, k);
        System.out.println("Array after rotation using extra space (right rotate):");
        printarray(ansExtra);

        int[] leftArr = arr.clone(); // clone for left rotation
        rotateLeftInPlace(leftArr, k);
        System.out.println("Array after left rotation in-place:");
        printarray(leftArr);

        int[] rightArr = arr.clone(); // clone for right rotation
        rotateRightInPlace(rightArr, k);
        System.out.println("Array after right rotation in-place:");
        printarray(rightArr);
    }
}
