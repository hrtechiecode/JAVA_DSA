package array.basics;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        System.out.print("Enter power: ");
        int n = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }

        System.out.println("Result: " + ans);
        sc.close();
        //optimised
        long binary=n;
        if(n<0){
            x=1/x;
            binary-=binary;
        }
        double answer=1;
while(binary>0){
    if(binary%2==1){
        answer*=x;
    }
    x*=x; //x^2
    binary/=2;
}
        System.out.println(answer);
    }
}
