package Java;

public class Classes_fun {
    //void fun1(){ //not run because we cannot call non static fun
    static void fun1() {
        System.out.println("hritika");
    }

    static void fun2() {
        System.out.println("hritik");
    }

  class Classes {
        //void fun1(){ //not run
        static void fun1() {
            System.out.println("22");
        }

        static void fun2() {
            System.out.println("20");
        }
    }

        public static void main(String[] args) {
            System.out.println("chaturvedi");
            fun1();
            fun2();
            Classes.fun1();
            Classes.fun2();
        }
    }