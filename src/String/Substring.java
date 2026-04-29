package String;
import java.util.*;
public class Substring {   //substring continuous part e.g abc==a,b,c,ab,bc,abc
    //print all substring of String a
    static void substring(){
        String a="physics";//0 to 6
        for(int i=0;i<=6;i++){// for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=7;j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
    //new empty string
    static String string(){
        String s="";//empty string
        for(int i=1;i<=10;i++){
           s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str="hri";
        //str=str+"tika";
       // str+='a';
        str+=10;
        System.out.println(str);
        System.out.println(str+20+20);
        System.out.println(str+(20+20));
        System.out.println(str+(20*20));
        System.out.println(str+20*20);
        String s="physics wallah";
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(3));
        for(int i=2;i<4;i++){
            System.out.println(s.substring(i));
        }
        String a3="hi";
        a3="physics";
        System.out.println(a3);
       a3= a3.substring(0)+'z'+a3.substring(2);
        System.out.println(a3);
        System.out.println("print all substring");
        substring();
        System.out.println(string());
        String str2="holla";
        for(int j=2;j<=str2.length();j++){
            System.out.println(str2.substring(0,j));
        }
    }
}
