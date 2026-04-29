package Sorting;

import java.util.Scanner;

public class Insertion_sort {
        static int[] arr;
        static Scanner sc = new Scanner(System.in);

        static void printarray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        static int[] inputarray() {
            System.out.println("enter size of an array");
            int n = sc.nextInt();
            arr = new int[n];
            System.out.println("enter elements of array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }

        static void  insertionsort(int[] arr) {
            for (int i = 1; i < arr.length ; i++) {
                int j=i;
                while(j>0&&arr[j-1]>arr[j])
                {
                       int temp=arr[j];
                       arr[j]=arr[j-1];
                       arr[j-1]=temp;
                       j--;
                    }
                }
                printarray(arr);

            }



        public static void main(String[] args) {
            inputarray();
            printarray(arr);
            insertionsort(arr);
            System.out.println("sorted array");
            printarray(arr);

        }
    }

