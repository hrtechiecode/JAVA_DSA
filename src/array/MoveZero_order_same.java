package array;

import java.util.Scanner;

public class MoveZero_order_same {
       public static void pushZerosToEnd(int[] arr,int n) {
            // code here
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                    count++;
                }

            }
        }

    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       pushZerosToEnd(arr,n);
        // ✅ Print the updated array
        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//| i | arr\[i] | count | Swap?          | Array after step         |
//| - | ------- | ----- | -------------- | ------------------------ |
//| 0 | 1       | 0     | Yes (same)     | {1, 2, 0, 4, 3, 0, 5, 0} |
//| 1 | 2       | 1     | Yes (same)     | {1, 2, 0, 4, 3, 0, 5, 0} |
//| 2 | 0       | 2     | No             | {1, 2, 0, 4, 3, 0, 5, 0} |
//| 3 | 4       | 2     | Yes (swap 4,0) | {1, 2, 4, 0, 3, 0, 5, 0} |
//| 4 | 3       | 3     | Yes (swap 3,0) | {1, 2, 4, 3, 0, 0, 5, 0} |
//| 5 | 0       | 4     | No             | {1, 2, 4, 3, 0, 0, 5, 0} |
//| 6 | 5       | 4     | Yes (swap 5,0) | {1, 2, 4, 3, 5, 0, 0, 0} |
//| 7 | 0       | 5     | No             | {1, 2, 4, 3, 5, 0, 0, 0} |
