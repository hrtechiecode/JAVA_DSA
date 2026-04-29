package array.prefix_sum;

import java.util.Scanner;

public class Equal_sum_partition {
    public static int totalsum(int []arr){
        int totalsum=0;
        for (int i = 0; i <arr.length; i++) {
           totalsum+=arr[i];
        }
        return totalsum;
    }

    public static boolean partition(int[]arr){
int totalSum=totalsum(arr);
       int prefsum=0;
        for (int i = 1; i <arr.length; i++) {
            prefsum += arr[i];
            int suffixsum = totalSum-prefsum;
            if(prefsum==suffixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("enter elements of array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("partionsum is equal or not :"+partition(arr));
    }
}