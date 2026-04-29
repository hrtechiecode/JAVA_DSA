package Java;
class Rose{
    int x;//instance variable
    private int x2;
    private static int y;
    void fun1(){
        y=20;
        x2=10;
    }
    void fun2(){
        System.out.println(y);
        System.out.println(x2);
    }
    void fun3(){
y=60;
    }
}
public class Static_Mem {
    public static void main(String[] args) {
        Rose r = new Rose();
        Rose s = new Rose();
        r.fun1();//y=20
        s.fun3();//y=60
        r.fun2();//print y=45
        s.fun2();
    }
}
