package array.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array {
public static void printarray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements of an array");
        int n=sc.nextInt();
        System.out.println("enter elements of an array");
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print original array");
        printarray(arr);
        System.out.println();
        int []copy=arr.clone();
        int[]copy2= Arrays.copyOf(arr,2);
        int[]copy3=Arrays.copyOfRange(arr,0,3);
        System.out.println("copied array");
        printarray(copy);
        System.out.println();
        //change some values in copy array
         copy[0]=10;
         copy[1]=20;
        System.out.println("original array after changing copy array ");
        printarray(arr);
        System.out.println("after change ");
        printarray(copy);
        System.out.println();
        printarray(copy2);
        System.out.println();
        printarray(copy3);

    }
}
