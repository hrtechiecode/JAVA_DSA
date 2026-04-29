package array.basics;

import java.util.Scanner;
//number of operations as a fun of input-->time complexity
//1 sec->10^8 operation  ,time limit->1sec time limit exceed
public class Array_sum {
    public static void star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){  //O(n^2)
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void star2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<Math.sqrt(n);j++){  //O(n*underroot n)
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void count(int n){
        int count=0;
        for(int i=1;i<n;i*=2){//O(log n)
            System.out.println(i);
            count++;
        }
        System.out.println("count operations "+count);
    }
    public static void count2(int n){
        int count=0;
        for(int i=1;i<n;i+=i){//O(log n)
            System.out.println(i);
            count++;
        }
        System.out.println("count operations "+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter elements of an array");
        int[]arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        star(n);
        System.out.println();
        star2(n);
        System.out.println();
        count(n);
        System.out.println();
        count2(n);
    }
}
