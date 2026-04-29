package array.prefix_sum;

import java.util.Scanner;

public class Prefix_sum {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] inputarray(){
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static int[] prefixsum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
    //inplace array no new array
    static int[] prefixsuminplace(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        inputarray();
        printarray(arr);
        int[] prefix=prefixsum(arr);
        printarray(prefix);
        int[]prefixum=prefixsuminplace(arr);
        printarray(prefixum);
    }
}
