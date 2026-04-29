package Constructor;

class demo2 {
    int x;
    int y;

    demo2(int a, int b) {
        x = a;
        y = b;
        System.out.println("Parameterized constructor called");
        System.out.println("x = " + x + ", y = " + y);
    }

    static void fun1() {
        System.out.println("hritika");
    }

    static void fun2() {
        System.out.println("hritik");
    }
}

public class Parameterised {
    public static void main(String[] args) {
        demo2 d1 = new demo2(5, 10);
        demo2 d2 = new demo2(20, 30);

        demo2.fun1();
        demo2.fun2();
    }
}
