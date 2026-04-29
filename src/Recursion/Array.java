package Recursion;

import java.util.Scanner;

public class Array {
    //print array
    public static void print(int []arr,int idx){
        //Time Complexity
        //O(n) → same as a for loop
        // Space Complexity
        //O(n) (because of recursion stack)
        //Every recursive call goes on the call stack
        if(idx==arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);
        //recursive
        print(arr,idx+1);
    }
    //print k multiples of nums.if n and k is given
   static void multiple(int n,int k){
       if(k==0) return;//base case
       multiple(n,k-1); //recursion
       System.out.println(n*k);//self
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of elements");
        int n=sc.nextInt();
        System.out.println("enter elements ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr,0);
        System.out.println();
        System.out.println("k mulriples");
        int k=sc.nextInt();
        multiple(n,k);
    }
}
