package Recursion;

import java.util.Scanner;

public class Sum {
    public static int sum(int[]arr,int idx){
       //base case
        if(idx==arr.length){
            return 0;
        }
        if(idx== arr.length-1){
            return arr[idx];
        }
        //recursion
       int add= sum(arr,idx+1);
        //self work
        return add+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of elements");
        int n=sc.nextInt();
        System.out.println("enter elements ");
        int[]arr=new int[n];
        for(int idx=0;idx<n;idx++){
            arr[idx]=sc.nextInt();
        }
        System.out.println( sum(arr,0));
    }
}
