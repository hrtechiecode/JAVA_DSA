package OOPS;

import java.util.Stack;

public class Basics {
    //creating a new datatype with multiple datatypes
    public static class Student {//ek aisa obj create karna jismein bahut saare attributes
        String name;
        int Roll_No;
        double percent;
    }
    public static class Car {
        String name;
        double price;
        String color;
    }
    public static void fun( Student x){

        System.out.println(x.name);
    }
    //pass by value
    public static void change( int p){

        p=5;
    }
    //user defined class are pass by reference
    public static void array( Student x){
        x.name="rose";
    }

    public static void main(String[] args) {
//       class Student {
//            String name;
//            int Roll_No;
//            double percent;
//        }
//        fun(7);
        Student x=new Student();//declaration object of same class having same properties
        x.name="hritika";//intialisation
        x.percent=85.7;
        x.Roll_No=27;
        System.out.println(x.name +6);
        System.out.println(x.Roll_No);
        System.out.println(x.percent);


        fun(x);
        array(x);
        System.out.println(x.name);
        Student y=new Student();
        y.name="hritik";
        y.percent=89.7;
        y.Roll_No=25;
        System.out.println(y.name );
        Car c=new Car();
        c.name="BMW";
        c.price=900000;
        c.color="silver";
        System.out.println(c.name);
int p=7;
        System.out.println("original");
        System.out.println(p);
        change(p);
        System.out.println("change"+p);
    }
}