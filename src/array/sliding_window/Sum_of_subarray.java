package array.sliding_window;

public class Sum_of_subarray {
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k+1;i++){
            int currsum=0;
            for(int j=i;j<k+i;j++){
                currsum=currsum+arr[j];

            }
            maxsum=Math.max(maxsum, currsum);
        }
        return maxsum;
    }
    public static int maxSubarraySumoptimized(int[] arr, int k) {
        int n=arr.length;
        if (n <= k) {
            System.out.println("Invalid");
            return -1;
        }
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for (int i = 1; i < n-k+1; i++) {
            window_sum += arr[i+k-1] - arr[i -1];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k = 3;
        System.out.println(maxSubarraySum(arr,k));

        System.out.println(maxSubarraySumoptimized(arr,k));
    }
}
