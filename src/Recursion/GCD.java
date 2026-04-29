package Recursion;

import java.util.Scanner;

public class GCD {
    public static int gcd_longDivision(int x,int y){
    while(x%y!=0){
        int rem=x%y;
        x=y;
        y=rem;
    }
    return y;
    }
    public static int gcd_Euclid(int x,int y){
       if(y==0){
           return x;
        }
        return gcd_Euclid(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd_longDivision(x,y));
        System.out.println(gcd_Euclid(x,y));
    }
}
