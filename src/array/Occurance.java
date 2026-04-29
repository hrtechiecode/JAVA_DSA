package array;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 7, 4};
        int target = 4;
        int count = 0;

        // Count occurrences of target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " occurs " + count + " time(s) in the array.");
       //last occurance
        int last_idx=-1;
        for(int i=0;i< arr.length;i++){
            if (arr[i] == target) {
                last_idx = i;
            }
        }
        System.out.println("last index "+last_idx);
    }
}