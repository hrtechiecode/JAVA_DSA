package OOPS;

import java.awt.event.MouseWheelEvent;

public class Default_Constructor {
    public static class Car {
        String brand;
        int speed;
        int seats;
//        Car(){  //default constructor name is same as class
//
//        }
//Car(String brand,int speed,int seats){
//    this.brand=brand;
//    this.speed=speed;
//    this.seats=seats;
//}
        Car(String b,int x,int y){
     seats=y;
     speed=x;
     brand =b;
        }
        void print(){
            System.out.println(brand+" "+speed+" "+seats);
        }
    }
    public static void main(String[] args) {
     //  Car c=new Car();//default constructor name is same as class
        Car c=new Car("BMW",500,8);
        System.out.println(c.seats);
        c.print();
        Car c2=new Car("FARARI",500,2);
        c2.print();
    }
}
