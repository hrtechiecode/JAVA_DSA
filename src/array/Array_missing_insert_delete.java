package array;

import java.util.Scanner;

public class Array_missing_insert_delete {

    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    static void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void inputArray() {
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Find missing number in 1..n
    static void findMissing() {
        System.out.println("Find the missing number in 1 to n (if one number is missing)");
        System.out.println("Enter range n:");
        int n = sc.nextInt();

        // if arr length is n-1, it works perfectly
        int sum = 0;
        int actualSum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int missing = actualSum - sum;
        System.out.println("Missing: " + missing);
    }

    // Insert element in array
    static void insertElement() {
        System.out.println("Insert element");
        System.out.println("Enter element to insert:");
        int element = sc.nextInt();
        System.out.println("Enter index:");
        int idx = sc.nextInt();

        if (idx < 0 || idx > arr.length) {
            System.out.println("Invalid index.");
            return;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < idx; i++) {
            newArr[i] = arr[i];
        }
        newArr[idx] = element;

        for (int i = idx; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        arr = newArr;
        System.out.println("Element inserted successfully!");
        printArray();
    }

    // Delete element from array
    static void deleteElement() {
        System.out.println("Delete element");
        System.out.println("Enter index to delete:");
        int idx = sc.nextInt();

        if (idx < 0 || idx >= arr.length) {
            System.out.println("Index out of bound");
            return;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == idx) continue;
            newArr[j++] = arr[i];
        }

        arr = newArr;
        System.out.println("Element deleted successfully!");
        printArray();
    }

    public static void main(String[] args) {
        inputArray();
        printArray();
        findMissing();
        insertElement();
        deleteElement();
    }
}
//| Operation | Time | Space |
//| --------- | ---- | ----- |
//| Missing   | O(n) | O(1)  |
//| Insert    | O(n) | O(n)  |
//| Delete    | O(n) | O(n)  |
