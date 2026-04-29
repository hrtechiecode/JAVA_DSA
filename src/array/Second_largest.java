package array;

import java.util.Scanner;

public class Second_largest {

    static int[] arr;

    static void printarray() {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void inputarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int max() {
        int max = Integer.MIN_VALUE; // Common Beginner Mistake ⚠
//        int max = 0;   // WRONG
//Fails when array contains only negative numbers
// Use Integer.MIN_VALUE instead
        //🔹 Time & Space
        //Time: O(n) + O(n) → O(n)
        //Space: O(1)
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }
    public static int second_max(int[]arr){
        int mx=max();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int sec_max=max();
        return sec_max;
    }

    public static  int getSecondLargest(int[] arr) {
        // code here
//        Time: O(n)
//        Space: O(1)
//✅ Array unchanged
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_max&&arr[i]<max){
                sec_max=arr[i];
            }
        }
        if (sec_max == Integer.MIN_VALUE) {
            return -1;
        }

        return sec_max;
    }

    public static void main(String[] args) {
        inputarray();
        System.out.println("original array");
        printarray();

        System.out.println("second max "+getSecondLargest(arr));
        System.out.println();
        System.out.println("second max array manipulation  "+second_max(arr));
    }
}
