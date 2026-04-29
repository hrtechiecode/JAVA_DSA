package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
//print whether target is present or not
public class Linear_Search {
    public static boolean linear_search(int[] arr, int target, int idx) {
        // base case
        if (idx == arr.length) {
            return false;
        }

        // self work
        if (arr[idx] == target) {
            return true;
        }

        // recursion
        return linear_search(arr, target, idx + 1);
    }
    //return all indices where element is present
    public static void allindices(int[] arr, int target, int idx) {
        // base case
        if (idx == arr.length) {
            return ;
        }

        // self work
        if (arr[idx] == target) {
            System.out.println(idx);
            //return; Jaise hi ek index milta hai, return lag jaata hai →
            // recursion wahi stop ho jaati hai
            // baaki indices check hi nahi hote
        }

        // recursion
        allindices(arr, target, idx + 1);
    }
    //return all indices where element is present in a arraylist
    public static ArrayList<Integer> arrayList(int[] arr, int target, int idx) {

        // base case
        if (idx == arr.length) {
            return new ArrayList<Integer>();//empty arraylist
        }
ArrayList<Integer>ans=new ArrayList<>();
        // self work
        if (arr[idx] == target) {
           ans.add(idx);

        }

        // recursion
        ArrayList<Integer>smallans= arrayList(arr, target, idx + 1);
ans.addAll(smallans);
return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of elements");
        int n=sc.nextInt();
        System.out.println("enter  element which we want to find");
        int target=sc.nextInt();
        System.out.println("enter elements ");
        int[]arr=new int[n];
        for(int idx=0;idx<n;idx++){
            arr[idx]=sc.nextInt();
        }

        System.out.println(linear_search(arr,target,0));
        allindices(arr,target,0);
        ArrayList<Integer> ans=arrayList(arr,target,0);
        for(Integer i:ans){
            System.out.print(i +" ");
        }
        System.out.println(ans);

    }
}
