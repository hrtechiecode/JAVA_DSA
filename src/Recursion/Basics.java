package Recursion;



import java.util.Scanner;
public class Basics {
//    public static void ajay() {
//        System.out.println("priya");
//    }
    public static void ajay(int n) {
        if(n>10)return;
        System.out.println("priya");
        ajay(n+1);
    }
static void natural_number(int n) {
        if(n==0) {
           // System.out.print("1 ");
            return;
        }
        natural_number(n-1);
        System.out.print(n+ " ");
    }
    public static void natural_number_reverse(int n) {
        if(n==0)return;
        System.out.print(n+" ");
        natural_number_reverse(n-1);
    }
    public static void change(int x){
        x=20;//local

    }
    static int x=50;//global variable
    public static void fun(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            ajay(1);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("print natural number ");
        natural_number(n);
        System.out.println();
        System.out.println("print natural number in reverse");
        natural_number_reverse(n);
        System.out.println();
        int x=10;//local
        change(x);
        System.out.println(x);
        fun();

        }


    }