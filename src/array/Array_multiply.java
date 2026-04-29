package array;

import java.util.Arrays;

//For a given array arr[], create a new array ans[] such that each element
// at index i of ans[] is the product of all the elements in arr[] except arr[i].

public class Array_multiply {
    public static void multiplybruteforce(int[]arr,int n){  //Complexity
//        Time: O(n²) (slow for large arrays)
//        Space: O(n)
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            ans[i] = product;
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int n = arr.length;
        int[] ans = new int[n];
        multiplybruteforce(arr,n);
        //use prefix and suffix for optimize approach
        ans[0] = 1; // for product except self
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i-1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix *= arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
//| Type        | Value                             |
//        | ----------- | --------------------------------- |
//        | Time        | **O(n)** ✅                        |
//        | Extra Space | **O(1)** (excluding output array) |
