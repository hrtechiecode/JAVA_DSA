package array;

import java.util.ArrayList;
import java.util.Scanner;
//print alternate element of an array
/*Using ArrayList
Best when
Output size unknown h
Function ko return karna h
GFG / LeetCode jaisa question ho*/
public class Alternate {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
    static int[] inputarray(){
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
        public static ArrayList<Integer> getAlternates(int arr[]) {
            // Code Here
            ArrayList<Integer> l = new ArrayList<>();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    l.add(arr[i]);
                }

            }
            return l;
        }
    public static void main(String[] args) {
        inputarray();
        System.out.println(getAlternates(arr));
    }
}

