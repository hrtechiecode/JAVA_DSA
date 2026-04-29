package Dynamic_program;

import java.util.Arrays;

public class Stickler_theif {
    static int[]dp;
    public int maxloot(int []arr,int idx){
        if(idx>= arr.length)return 0;  //  base case must return 0 (no loot)
        if (dp[idx]!=-1)return dp[idx]; //  memoization check
        int steal=arr[idx]+ maxloot(arr, idx + 2);
        int skip=maxloot(arr,idx+1);
        return Math.max(steal,skip);
    }
    public int findmax(int []arr){
    dp=new int[arr.length];
    Arrays.fill(dp,-1);
    return maxloot(arr,0);
    }

    public static void main(String[] args) {
        int[]arr={6,5,1,7,4};
        Stickler_theif s = new Stickler_theif();  // create object to call instance methods
        System.out.println(s.findmax(arr));
    }
}
