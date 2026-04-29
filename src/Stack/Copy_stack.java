package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Copy_stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        System.out.println("enter number of element ");
        int n=sc.nextInt();
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            s.push(x);
        }
        System.out.println(s);
        //reverse
        Stack<Integer> s2=new Stack<>();
        while(s.size()>0){
          int x=s.peek();
          s2.push(x);
          s.pop();
        }
        System.out.println(s2);
        System.out.println(s);
        Stack<Integer> s3=new Stack<>();
        while(s2.size()>0){
            s3.push(     s2.pop());
        }
        System.out.println(s3);
    }
}
