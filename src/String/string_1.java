package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class string_1 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        for (char ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        //typecasting
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        String s = "hi, my name is hritika";
        System.out.println(s);
        for(char ch=0;ch<s.length();ch++){
            System.out.println(s.charAt(ch));
        }
        //to access character
        System.out.println(s.charAt(4));
        System.out.println("string length "+s.length());
        System.out.println("take i/p");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(); //print before space
        System.out.println(s1);
//        String s2=sc.nextLine(); //print whole strong with or without space
//        System.out.println(s2);
        String s3="hello";
        s3+="holla";
        s3+=10;
        s3+='\n';
        s3+="jeloo";
        System.out.println(s3);
        //INT TO STRING
        System.out.println("enter integer");
        int n=sc.nextInt();
        String x=" ";//empty string
        x+=n;
        System.out.println(x);
        //INT TO STRING using inbuilt function
        int a=102;
       String str= Integer.toString(a);
        System.out.println("int to string "+str);
        //STRING to int using inbuilt function
        String y="12336747";
        int p=Integer.parseInt(y);
        System.out.println(" string to int "+p);

    }
}
