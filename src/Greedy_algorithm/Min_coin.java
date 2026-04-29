package Greedy_algorithm;

import java.util.Arrays;

public class Min_coin {
    public static int mincoin(int[]coins,int amount){
        int n=coins.length;
        Arrays.sort(coins);
        int res=0;
       for(int i=n-1;i>=0;i--){
           if(amount>=coins[i]) {
               int count = (amount / coins[i]);
               res += count;
               amount -= (count * coins[i]);
           }
           //Use 10 → 39 / 10 = 3 → Use 3 coins → amount left = 39 - 30 = 9
           //Use 5 → 9 / 5 = 1 → Use 1 coin → amount left = 9 - 5 = 4
           //Use 2 → 4 / 2 = 2 → Use 2 coins → amount left = 4 - 4 = 0
           //➡️ Total coins = 3 + 1 + 2 = 6
           if (amount == 0)
               break;
       }
        return res;

    }
    public static void main(String[] args) {
            int[] coins = {5, 2, 10, 1};
            int amount = 39;
        System.out.println(mincoin(coins,amount));
        }
}
