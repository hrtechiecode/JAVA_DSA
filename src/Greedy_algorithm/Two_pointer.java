package Greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Two_pointer {
    public static List<int[]> twosum(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                pairs.add(new int[]{i, j});
                i++;
                j--;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 60};
        int target = 70;
        List<int[]> result = twosum(arr, target);
        if (result.size() == 0) {
            System.out.println("no pair found");
        } else {
            System.out.println("Pairs found:");
            for (int[] pair : result) {
                System.out.println("Indices: " + Arrays.toString(pair));
            }
        }
    }
}
//public class Two_pointer {
//    public static int[] twosum(int[] arr, int target) {
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            if (arr[i] + arr[j] > target) {
//                j--;
//            } else if (arr[i] + arr[j] < target) {
//                i++;
//            } else {
//                return new int[]{i, j};
//            }
//        }
//        return new int[]{};
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 20, 30, 40, 50, 55, 60};
//        int target = 80;
//       int[]result= twosum(arr,target);
//        if(result.length==0){
//            System.out.println("no pair found");
//        }
//        else{
//            System.out.println("Pair found at indices: "+ Arrays.toString(result));
//        }
//    }
//}