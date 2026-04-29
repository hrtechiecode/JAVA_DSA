package String;

import java.util.Scanner;
public class CountVowel {
public static int countvowel(String s){
    int count=0;
    for(char i=0;i<s.length();i++) {
        //print character
       // System.out.print(s.charAt(i));
       // System.out.println();
        //count vowel
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("i/p string");
        String s=sc.nextLine();
        System.out.println("count of vowel");
        System.out.println( countvowel(s));
    }
}
