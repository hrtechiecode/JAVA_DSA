package array.two_Pointer;

import java.util.Scanner;

public class Nondecreasing_sqarray {
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

    public static int[] sq(int[]arr){
        int i=0;
        int j=arr.length-1;
        int ans[]=new int [arr.length];
        int k= arr.length-1;
        while (i<=j) {
        if(Math.abs(arr[i])>Math.abs(arr[j])){
            ans[k--]=arr[i]*arr[i];
            i++;
        }
            else{
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        inputarray();
        int[] result = sq(arr);
        System.out.println("Non-decreasing squares array:");
       printarray(result);
    }
}
