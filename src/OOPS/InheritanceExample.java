package OOPS;

// 🔹 Parent class
class Parent {
    int money = 5000;

    void showMoney() {

        System.out.println("Money from parent: " + money);
    }

    void display() {

        System.out.println("I am Parent class");
    }
}

// Child class inherits from Parent
class Child extends Parent {
    String name = "Hritika";

    void displayChild() {
        System.out.println("I am Child class");
        System.out.println("Name: " + name);
    }
}

//  Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Child c = new Child();

        // Access child’s own method
        c.displayChild();

        // Access parent’s method
        c.showMoney();
        c.display();
    }
}
