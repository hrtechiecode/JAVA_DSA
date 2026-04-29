package Dynamic_program.tabulation;

public class Stickler_Theif {

    static int[] dp;

    public int findmax(int[] arr) {

        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        dp = new int[n];

        // base cases
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        // tabulation
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 7, 4};
        Stickler_Theif s = new Stickler_Theif();
        System.out.println(s.findmax(arr));
    }
}
