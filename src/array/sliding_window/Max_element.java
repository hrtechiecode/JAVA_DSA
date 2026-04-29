package array.sliding_window;

import java.util.Arrays;

public class Max_element {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,1,2,3,4,5,1};
        int n= arr.length;
        int k=3;
        int[]ans=new int[n-k+1];
        int p=0;
        //1 2 3 4 5 --> 3
        //n-(k-1)
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
             max=Math.max(max,arr[j]);
            }
             ans[p++]=max;
        }
        System.out.println(Arrays.toString(ans));
        //sliding window optimize

    }
}
