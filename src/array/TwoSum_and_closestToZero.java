package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum_and_closestToZero {
    public static boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    // User function Template for Java
        public static int closestToZero(int arr[], int n) {
            // your code here
            int i=0;int j=n-1;
            Arrays.sort(arr);
            int sum=arr[i]+arr[j];
            while(i<j){
                int currsum=arr[i]+arr[j];
                if(sum==0){
                    return sum;
                }
                if (Math.abs(currsum) < Math.abs(sum) ||
                        (Math.abs(currsum) == Math.abs(sum) && currsum > sum)) {
                    sum = currsum;
                }
                if(currsum>0){
                    j--;
                }
                else{
                    i++;
                }
            }
            return sum;
        }
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(twoSum(arr,target));
        System.out.println(closestToZero(arr,n));
        }
                }
