package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_maxmin_search_sort_merge_evenodd {
    static Scanner sc = new Scanner(System.in);

    static int[] inputArray() {
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    static void search(int[] arr) {
        System.out.println("Enter element to search:");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    static void sort(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println("Sorted: " + Arrays.toString(temp));
    }

    static void merge() {
        System.out.println("Input first array:");
        int[] arr1 = inputArray();

        System.out.println("Input second array:");
        int[] arr2 = inputArray();

        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        for (int num : arr1) merged[k++] = num;
        for (int num : arr2) merged[k++] = num;

        System.out.println("Merged: " + Arrays.toString(merged));
    }

    static void evenOdd(int[] arr) {
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int e = 0, o = 0;

        for (int num : arr) {
            if (num % 2 == 0) even[e++] = num;
            else odd[o++] = num;
        }

        System.out.print("Even: ");
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
        System.out.println();

        System.out.print("Odd: ");
        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        printArray(arr);
        System.out.println("Sum: " + sum(arr));
        maxMin(arr);
        search(arr);
        sort(arr);
        evenOdd(arr);
        merge();
    }
}
