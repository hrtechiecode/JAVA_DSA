package String;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;

// strings are immutable.a string is terminated with a special character ‘\0’
public class String_basics {
    public static void main(String[] args) {
        String a="hi";
        System.out.println(a);
      //  a.concat("holla"); //no change because string are immutable
       String x= a.concat("holla");
        System.out.println(x);
        String b="hritika";
        System.out.println(b);
        System.out.println(a+" " +b);
        String c="hritika";
        String d=new String("hritika");  //new memory
        System.out.println(a==b);//false
        System.out.println(b==c);//true
        System.out.println(c==d);//false
        System.out.println(b.toLowerCase());
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLetter(7));
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        System.out.println(p.length());
        System.out.println(p.charAt(2));
        System.out.println(p.indexOf('a')); //if nhi hai toh o/p -1
        String a1="hello";
        String a2="holla";
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.concat(a2));
         String a3="hi";
         a3="pie";

     System.out.println(a3);
        System.out.println();
String st="lily"+10+20;
        System.out.println(st);
        String st2=10+"lily"+10+20;
        System.out.println(st2);
        String st3=10+30+"lily"+10+20;
        System.out.println(st3);
    }
}
