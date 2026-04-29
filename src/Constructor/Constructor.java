package Constructor;

class demo {
    int x;
    int y;

    static void fun1() {
        System.out.println("hritika");
    }

    static void fun2() {
        System.out.println("hritik");
    }

    demo() {  //constructor
        x = 5;
        y = 10;
        System.out.println("Default constructor called");
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Constructor {
    public static void main(String[] args) {
        demo d = new demo();  //call constructor

        // demo.fun1();
        // demo.fun2();
    }
}
