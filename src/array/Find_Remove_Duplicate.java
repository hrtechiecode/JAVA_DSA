package array;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Remove_Duplicate {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
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
    static void find() {
        for (int i=0 ; i < arr.length; i++) {  //O(n²)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("duplicate" + " " + arr[i]);
                    break;
                }
            }
        }
    }
//remove duplicates
static void remove() {
        int n= arr.length;
        Arrays.sort(arr);
        int ans[]=new int[n];
        int k=0;
    ans[k++] = arr[0];
    for (int i=1 ; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
              ans[k++]=arr[i];
            }
        }
    System.out.println("\nArray after removing duplicates:");
    for(int i = 0; i < k; i++) {
        System.out.print(ans[i] + " ");
    }
}
    public static void main(String[] args) {
        inputarray();
        find();
        remove();


    }
}
