package OOPS;

public class PassingClassToMethod {
    Student s1 = new Student(); // object create

    public static class Car {
        String brand;
        int speed;
        int seats;
        void print(){
            System.out.println(brand+" "+speed+" "+seats);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.speed = 120;
        c.seats=6;
        change(c);
        System.out.println(c.seats+" "+c.speed+" ");
        c.print();
    }
    //    public static void change(Car x) x bhi yaha car c ko hi point karega
    public static void change(Car c){ //pass by reference->object ko function mein bhejna
        c.seats=8;
    }
}

