package Recursion;

import java.util.Scanner;

public class SumWithAlternatesign {
    static int sumalternatesign(int n) {
        if (n == 0) return 0;//base case
        if (n % 2 == 0) {
            return sumalternatesign(n - 1) - n; //even rescursion
        }
        else{
            return sumalternatesign(n - 1) + n; //odd rescursion
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of elements");
        int n=sc.nextInt();
        int ans = sumalternatesign(n);  // store result
        System.out.println(ans);        // print result

    }
}
