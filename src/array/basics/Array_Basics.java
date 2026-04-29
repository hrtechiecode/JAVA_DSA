package array.basics;

import java.util.Arrays;

public class Array_Basics {
    public static void array(){
        int[] arr;//array declaration

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the elements of the array
        // first to last(fifth) element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[1]);  //Access element → O(1)  o/p 20
        System.out.println(arr);//  [I@27716f4
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index "
                    + i + " : " + arr[i]);
    }

    public static void stringArray(){
    String[] str1 = {"hritika", "hritika", "hi", "hello"};
    System.out.println(str1);//[Ljava.lang.String;@2a84aee7
        System.out.println();
    for(int i=0;i< str1.length;i++){
        System.out.print(str1[i]+" ");
    }
    System.out.println();
    // Example 1: Arrays.toString() for 1D array
    String[] str = {"hritika", "hritika", "hi", "hello"};
    System.out.println("Using Arrays.toString():");
    System.out.println(Arrays.toString(str));
    System.out.println();

    // Example 2: Arrays.asList() to convert array to list
    System.out.println("Using Arrays.asList():"); // Important Points:
// Converts array → Fixed-size List
// Cannot add/remove elements
    System.out.println(Arrays.asList(str));
    System.out.println();

    // Example 3: Arrays.deepToString() for 2D array
    int[][] int2DArray = {
            {1, 2},
            {3, 4}
    };
    System.out.println("Using Arrays.deepToString():");
    System.out.println(Arrays.deepToString(int2DArray));

}
    public static void main(String[] args) {
        array();
        stringArray();
    }

}
