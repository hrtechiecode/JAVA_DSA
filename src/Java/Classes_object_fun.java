package Java;
class Mahesh{
    int x;//instance(object)variable
    int y;
void fun1(){ //NON STATIC ,INSTANCE(object) MEMBER function

    System.out.println("fun1");
}
void fun2(){

    System.out.println("fun2");
    }
}
public class Classes_object_fun {

    public static void main(String[] args) {
Mahesh m1=new Mahesh();//object
        Mahesh m2=new Mahesh();//object
        System.out.println(m2.x); //0
        System.out.println(m1.x); //0
        m1.y=10;
        System.out.println(m1.y);
        m1.fun1();
    }
}
