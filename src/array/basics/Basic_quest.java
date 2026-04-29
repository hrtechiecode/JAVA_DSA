package array.basics;

import java.util.Arrays;
import java.util.Scanner;
//Constant → Log → Linear → nlogn → Quadratic → Cubic → Exponential → Factorial
//alternative number
//whether an array is sorted or not
//largestandsmallest number
public class Basic_quest {
    //alternative number
    static void alternative_number(int[] arr) {  //time complexity  O(n/2) __> O(n)
      //  Because constants are ignored in Big-O.
//        Loop: n/2 times
//        No condition check
//        Printing: n/2 times
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void alternative_number2(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {  //time complexity  O(n)
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //whether an array is sorted or not
    static boolean array_sorted_or_not(int[]arr){
        /*
        i=0
        arr[0]<arr[-1]*/
        for (int i = 1; i < arr.length; i++) {      //O(n)
                if(arr[i-1]>arr[i]){
                    return false;
            }
    }
        return true;
    }
    static boolean array_sorted_or_not2(int[]arr) {
        /*
        i=0
        arr[0]<arr[-1]*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { //O(n^2)
                if (arr[i] > arr[j]) {

                    return false;
                }
            }
        }
        return true;
    }
    //largest and smallest number
    static int[] largest_smallest(int[]arr) {
        Arrays.sort(arr);  //O(n log n)  modifies the original array
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }
    static int[] largest_smallest_optimized(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {  //O(n)
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }



    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        alternative_number(arr);
        alternative_number2(arr);
        array_sorted_or_not(arr);
        // Call and print result
        if (array_sorted_or_not(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
        array_sorted_or_not2(arr);
        if (array_sorted_or_not2(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
        int []ans=largest_smallest(arr);
        System.out.println("smallest "+ans[0]);
        System.out.println("largest "+ans[1]);
        int[] ans2 = largest_smallest_optimized(arr);
        System.out.println("Smallest: " + ans2[0]);
        System.out.println("Largest: " + ans2[1]);
    }
}