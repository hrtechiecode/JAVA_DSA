package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFrombottom_or_atanyidx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        // Input
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println("Original Stack: " + s);

        // Delete details
        int idx = 2;        // 0-based index from bottom

        // Index validation
        if (idx < 0 || idx > s.size()) {
            System.out.println("Invalid index");
            return;
        }

        // Auxiliary stack
        Stack<Integer> temp = new Stack<>();

        // Move elements above index
        while (s.size() > idx+1) {
            temp.push(s.pop());
        }

        // Delete element
        s.pop();

        // Restore elements
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        // Output
        System.out.println("Stack after Deletion: " + s);

        //for bottom we can apply loop while(s.size()>1)
    }
}
