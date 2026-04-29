package Recursion;

import java.util.Scanner;

public class Max_Array {
    public static int max(int []arr,int idx){
        //base case
        if(idx==arr.length-1){//O(n) space and time complexity
            return arr[idx];
        }
        //recusive
      int maxelement=  max(arr,idx+1);
        //self work
       int ans= Math.max(maxelement,arr[idx]);
        return ans;
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
        System.out.println( max(arr,0));

    }
}
