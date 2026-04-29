package array;

import java.util.Scanner;
//find total numbers of pairs equal to target
public class Pair_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of an array");
        int n=sc.nextInt();
        System.out.println("enter target");
        int target=sc.nextInt();
        System.out.println("enter array elememts");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
              if (arr[i] + arr[j] == target)
{
                    ans++;
                }
            }

        }
        System.out.println(ans);

    }
}
