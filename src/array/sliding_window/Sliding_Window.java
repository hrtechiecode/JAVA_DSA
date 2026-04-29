package array.sliding_window;
//The sliding window is an optimization technique to reduce the time complexity of problems
// involving arrays or strings — especially when you're working with contiguous subarrays/substrings.
public class Sliding_Window {
    public static void main(String[] args) {
        //Find the maximum sum of any subarray of size k.
        int[]arr={1,2,3,4,5};
        int k = 3;
        int maxSum = 0, sum = 0;
        // First window
        for (int i = 0; i < k; i++) {
      //      sum += arr[i];
            if(arr[i]%2==0){
                sum += arr[i];
            }
        }
        maxSum = sum;
       for(int i=k;i< arr.length;i++){

           // Remove the element going out of the window if it's even
           if (arr[i - k] % 2 == 0) {
               sum -= arr[i - k];
           }

           // Add the new element coming into the window if it's even
           if (arr[i] % 2 == 0) {
               sum += arr[i];
           }
           maxSum = Math.max(maxSum, sum);
       }

        System.out.println(maxSum);
    }
}
