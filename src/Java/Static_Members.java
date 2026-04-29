package Java;

class Demo{
    private static int x;
void fun(){
    x=10;
    System.out.println(x);
}
static void fun1(){
    x=20;
    System.out.println(x);
}
}
public class Static_Members {
    public static void main(String[] args) {
//Demo.x; //we can not access private member o/s class
        Demo d=new Demo();
        d.fun();
        Demo.fun1();
    }
}
