package array;

import java.util.Scanner;

public class Reverse {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
    static void printarray(int []arr){
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
    public static int[] reverse(int[]arr){
        int n= arr.length;
        int[]ans=new int[n];
        int k=0;
        for(int i= arr.length-1;i>= 0;i--){
            ans[k++]=arr[i];
        }
        return ans;
    }
    public static int[] reverseinplace(int[]arr){
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }


    public static void main(String[] args) {
       inputarray();
        int[] result = reverse(arr);
        System.out.println("Reversed (non-in-place):");
        printarray(result);
int[]inplace=reverseinplace(arr);
printarray(inplace);
    }
}
//| Method           | Time | Space |
//| ---------------- | ---- | ----- |
//| reverse()        | O(n) | O(n)  |
//| reverseInPlace() | O(n) | O(1)  |