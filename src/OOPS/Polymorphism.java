package OOPS;
//polymorphism:-many forms-->ek naam multiple kaam  In Object-Oriented Programming,
// it allows one function/method name to behave differently based on the situation.
class Calculator {
    // method 1
    int add(int a, int b) {
        return a + b;
    }

    // method 2 — same name, different number of parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method 3 — same name, different data type
    double add(double a, double b) {

        return a + b;
    }
}

class polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum of 2 int: " + c.add(2, 3));
        System.out.println("Sum of 3 int: " + c.add(2, 3, 4));
        System.out.println("Sum of 2 double: " + c.add(2.5, 3.5));
    }
}
