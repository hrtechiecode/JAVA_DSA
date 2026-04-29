package Java;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //ternary operator
        String ans;
        ans = (n % 2 == 0) ? "true" : "False";
        System.out.println(ans);
        //max number
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        System.out.println(max);
        System.out.println("Enter a number for post-increment test:");
        int p=sc.nextInt();
         int x;
        System.out.println(x=p++);
        System.out.println(p);
        System.out.println("shift operators");
        System.out.println(5>>2); //5/2^2
        System.out.println(5<<2);//5*2^2
        System.out.println(9>>1);
    }
}
