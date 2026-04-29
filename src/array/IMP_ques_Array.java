package array;

import java.util.Scanner;

public class IMP_ques_Array {
    public static int[]freqarr(int[]arr){
     int[]freq=new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
        }

    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[]freq=freqarr(arr);
        System.out.println("enter no. of quries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter no. to be searched");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }

    }
}
