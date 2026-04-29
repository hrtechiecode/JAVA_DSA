package String;

import java.util.Scanner;

//remove occurance of a in string abax
public class RemoveOccuranceofacharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("character to remove");
        char ch = sc.next().charAt(0);
        String ans="";
        for(int i=0;i<s.length();i++){
          if(ch!=s.charAt(i)){
           ans+=s.charAt(i);
              System.out.println(ans);
          }
        }

    }
}
