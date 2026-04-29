package Sorting;

import java.util.Scanner;

public class Bubble_sort {
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] inputarray() {
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//n-1 passes
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }

            printarray(arr);

        }
    }
    static void reversebubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//n-1 passes
            for (int j=0 ;j<arr.length-1-i ;j++) {
                if (arr[j] <arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            printarray(arr);

        }
    }


    public static void main(String[] args) {
        inputarray();
        printarray(arr);
        sort(arr);
        System.out.println("sorted array");
        printarray(arr);
        System.out.println();
        reversebubblesort(arr);
        System.out.println("after reverse sort");
        printarray(arr);

    }
}