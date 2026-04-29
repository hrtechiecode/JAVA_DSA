package Sorting;

import java.util.Scanner;

public class Selection_sort {
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

        static void selectionsort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {//n-1 passes
                int min=Integer.MAX_VALUE;
                int minidx=-1;
                for (int j= i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minidx = j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;
                printarray(arr);

            }
        }
        //selection sort using max element

    static void maxselectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//n-1 passes
            int max=arr[i];
            int maxidx=i;
            for (int j= i+1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxidx = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
            printarray(arr);

        }
    }


        public static void main(String[] args) {
            inputarray();
            printarray(arr);
            selectionsort(arr);
            System.out.println("sorted array");
            printarray(arr);
            System.out.println();
            maxselectionsort(arr);
            System.out.println("sorted array");
            printarray(arr);

        }
    }
