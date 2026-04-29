package String;

import java.util.Scanner;

public class palindrome {
    static boolean ispalindrome(String s) {
        //two pointers
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;//palindrome
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                //  flag = false;
                //  break;
                return false;
            }
            i++;
             j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        System.out.println(ispalindrome(s));
    }
}
