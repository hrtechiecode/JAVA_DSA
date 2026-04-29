package Multidimensional_array;

import java.util.Scanner;

public class Spiral_Matrix {

    static Scanner sc = new Scanner(System.in);

    // Print matrix normally
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Take input
    static void input(int[][] arr, int r, int c) {
        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Spiral traversal
    public static void spiral(int[][] arr, int r, int c) {

        int toprow = 0;
        int bottomrow = r - 1;
        int leftcol = 0;
        int rightcol = c - 1;

        int totalcount = 0;

        while (totalcount < r * c) {

            // 1. Top row (left → right)
            for (int j = leftcol; j <= rightcol && totalcount < r * c; j++) {
                System.out.print(arr[toprow][j] + " ");
                totalcount++;
            }
            toprow++;

            // 2. Right column (top → bottom)
            for (int i = toprow; i <= bottomrow && totalcount < r * c; i++) {
                System.out.print(arr[i][rightcol] + " ");
                totalcount++;
            }
            rightcol--;

            // 3. Bottom row (right → left)
            for (int j = rightcol; j >= leftcol && totalcount < r * c; j--) {
                System.out.print(arr[bottomrow][j] + " ");
                totalcount++;
            }
            bottomrow--;

            // 4. Left column (bottom → top)
            for (int i = bottomrow; i >= toprow && totalcount < r * c; i--) {
                System.out.print(arr[i][leftcol] + " ");
                totalcount++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        input(arr, r, c);

        System.out.println("\nSpiral Order:");
        spiral(arr, r, c);

        System.out.println("\n\nMatrix:");
        print(arr);
    }
}
