package array.sliding_window;
//Given a number x and an array of integers arr, find the smallest subarray with sum greater
// than the given value. If such a subarray do not exist return 0 in that case.
public class Variable_sliding_window {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int n=arr.length;
        int minlength = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>x){
                    minlength=Math.min(minlength,j-i+1);
                    break;

                }

            }
        }
        if (minlength == Integer.MAX_VALUE)
            return 0;

        return minlength;

    }
    public static int smallestSubWithSumoptimized(int x, int[] arr) {
        // Your code goes here
        int n=arr.length;
        int minlength = Integer.MAX_VALUE;
            int sum=0;
            int left=0;
            for(int rt=0;rt<n;rt++) {
                sum += arr[rt];
                while (sum > x) {
                    minlength = Math.min(minlength, rt - left + 1);
                    sum -= arr[left];
                    left++;
                }

            }
        if (minlength == Integer.MAX_VALUE)
            return 0;

        return minlength;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int x= 3;
        System.out.println( smallestSubWithSum(x,arr));
        System.out.println(smallestSubWithSumoptimized(x,arr));
    }
}
