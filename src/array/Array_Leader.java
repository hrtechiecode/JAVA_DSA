package array;
import java.util.*;
public class Array_Leader {
    public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        //An element is a leader if it is greater than or equal to all elements on its right side.
        ArrayList<Integer>l=new ArrayList<>();
        int j=arr[arr.length-1];
        l.add(j);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=j){
                l.add(arr[i]);
                j=arr[i];
            }
        }
        Collections.reverse(l);
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
       int[] arr=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array_leader");
        System.out.println(leaders(arr));
    }
}
