package array.two_Pointer;

import java.util.Scanner;

public class Even_Odd {
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
    public static void sortevenandodd(int[]arr){
        int i=0;
        int j=arr.length-1;
      while (i<j){
          if(arr[i]%2==0){
              i++;
          }
         if(arr[j]%2!=0){
              j--;
          }
        if(arr[i]%2!=0&&arr[j]%2==0){
              swap(arr,i,j);
              i++;
              j--;
          }
      }
    }
    public static void main(String[] args) {
        inputarray();
        sortevenandodd(arr);
        System.out.println("Array after sorting even and odd:");
       printarray(arr);
    }
}
