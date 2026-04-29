package String;

import java.util.Arrays;
import java.util.Scanner;

public class Most_Freq_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        int maxfreq=-1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            }
            else{

            }
        }
    }
}
