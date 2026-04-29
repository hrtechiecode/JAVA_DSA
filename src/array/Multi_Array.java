package array;

import java.util.Scanner;

public class Multi_Array {
    //of same size
    static void square_cube(int[] array) {
        double[] square = new double[array.length];
        double[] cube = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            square[i] = Math.sqrt(array[i]);
            cube[i] = Math.cbrt(array[i]);
        }
        System.out.println("square root");
        for (int i = 0; i < array.length; i++) {
            System.out.print(square[i]+" ");
        }
        System.out.println();
        System.out.println("cube root");
        for (int i = 0; i < array.length; i++) {
            System.out.print(cube[i]+" ");
        }
    }
    //of different size
    //merge two array of equal size  into another array such that new array have alternate values of two array
    static void merge() {
        int[]a={1,2,3,4,5};
        int[]b={6,7,8,9,10};

        int[]new_array=new int[a.length*2];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            new_array[k++]=a[i];
            new_array[k++]=b[i];
        }
        System.out.println("merged array");
        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i]+" ");
        }
        System.out.println();

    }
    //merge array of 2 diff. size
    static void merge2() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8};

        int[] new_array = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            new_array[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            new_array[k++] = b[i];
        }
        System.out.println("merged array of two different size");
        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
        System.out.println();
    }
    static void split(){
        int[]arr={1,2,3,4,5,6,7,8,9,10};

        // First count even and odd numbers to create proper-sized arrays
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        // Fill the even and odd arrays
        int e = 0, o = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }

        // Print even array
        System.out.print("Even elements: ");
        for(int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }

        // Print odd array
        System.out.print("\nOdd elements: ");
        for(int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        square_cube(arr);
        merge();
        merge2();
        split();
    }

}