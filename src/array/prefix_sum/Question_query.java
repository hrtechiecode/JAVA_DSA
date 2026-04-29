package array.prefix_sum;

import java.util.Scanner;
//anser q queries where you have to print sum of values in given range of indices and 1 based indesing
public class Question_query {
    static int[] pref(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
            System.out.println("enter size of an array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n+1];
        System.out.println("enter elements of array");
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            System.out.print(arr[i] + " ");
        }
        int[] prefix=pref(arr);
        System.out.println();
        System.out.println("enetr no. of queries");
       int q=sc.nextInt();
        while(q>0) {
            System.out.println("enter range of quries");
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("sum of values in given range of indices");
            int ans = prefix[r] - prefix[l - 1];
            System.out.println("sum " + ans);
        }
                   }
    }

