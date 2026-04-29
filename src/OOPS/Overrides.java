package OOPS;

    // Parent class
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class overrides sound()
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class Overrides {
        public static void main(String[] args) {
            Animal a = new Animal();
            Dog d = new Dog();
            Animal ref = new Dog(); // upcasting

            a.sound();  // calls Animal’s method
            d.sound();  // calls Dog’s overridden method
            ref.sound(); // calls Dog’s method (runtime decision)
        }
    }
