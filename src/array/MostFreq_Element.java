package array;

import java.util.Arrays;
import java.util.Scanner;

public class MostFreq_Element {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size of an array");
            int n=sc.nextInt();
            System.out.println("enter elements of an array");
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            int maxfreq=0;
            int mostfreq=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    count++;
                }
                if(count>maxfreq){
                    maxfreq=count;
                    mostfreq = arr[i];
                }
            }
            System.out.println(" most freq element "+mostfreq);
            System.out.println("max freq "+maxfreq);
        }

    }

