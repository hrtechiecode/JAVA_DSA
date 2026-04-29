package array.subarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//print subarray
public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\nAll subarrays:");
        for (int i = 0; i < n; i++) {            // Start index
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < n; j++) {        // End index
                temp.add(list.get(j));           // Add element to current subarray
                System.out.println(temp);        // Print current subarray
            }
        }

        sc.close();
    }
}