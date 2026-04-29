package Java;

public class practice {
    public static void main(String[] args) {
//        🔥 Important Concept:
//        When you assign a new value, the old value is lost unless you store it in another variable.
        int x = 10;
        int y = x;
        x = 20;
        System.out.println(x);//updated value
        System.out.println(y);//  (y still holds the old value)
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(a + b + c);
//        🔹 String Concatenation:
//        If the first operand is a String, all subsequent + operations will be treated as String concatenation.
//        If all are numbers, they’ll be added.
        System.out.println(a + b + "" + c); //concatenation
        System.out.println("hello " + a + b + c);//means concatenation, not addition
        System.out.println(a + "" + b + c);
        //Increment - Decrement operators
                int p= 10;

                System.out.println("Post-Increment: " + p++); // 10
                System.out.println("After Post-Increment: " + p); // 11

                int q = 10;
                System.out.println("Pre-Increment: " + ++q); // 11
                System.out.println("After Pre-Increment: " + q); // 11
        int x2 = 5;
        float f = x2;      // int to float ✅ (automatic)
        System.out.println("int to float "+f);
        float y2 = 3.14f;
        int i = (int) y2;  // float to int ❌ needs casting
        System.out.println("float to int "+i);
        //ascii value
        char ch = 'a';
        System.out.println((int) ch); // 97
//        Follow BODMAS:
//        Brackets
//        Division & Multiplication (left to right)
//        Addition & Subtraction (left to right)
        int result = 2 * 3 / 4 + 7 / 4 + 8 - 2 + 5 / 8;
        System.out.println(result);

    }
        }
