package Sorting;

import java.util.Scanner;

public class Merge_sort {
    public static void merge(int[] arr1, int[] arr2, int[] arr) {
        int idx = 0, i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[idx++] = arr1[i++];
            } else {
                arr[idx++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[idx++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[idx++] = arr2[j++];
        }
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        //base case
        if (n == 1) {
        return;
        }
        //create two empty array of size n/2
        int mid=n/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[n - mid];
        int k = 0;
        //copy paste arr into arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[k++];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k++];
        }
        //apply magic on arr1 and arr2
        mergesort(arr1);
        mergesort(arr2);
        //merge arr1 and arr2 into arr
        merge(arr1,arr2,arr);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            mergesort(arr);

            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }