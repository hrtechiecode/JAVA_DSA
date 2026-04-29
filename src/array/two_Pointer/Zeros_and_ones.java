package array.two_Pointer;

import java.util.Scanner;

public class Zeros_and_ones {
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
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void sort(int[]arr) {
        int left = 0;
        int rt = arr.length - 1;
        while (left < rt) {
            if (arr[left] == 1 && arr[rt] == 0) {
                swap(arr, left, rt);
                left++;
                rt--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[rt] == 1) {
                rt--;
            }

        }
    }
    public static void main(String[] args) {
        inputarray();
        sort(arr);
        printarray(arr);

    }
}
