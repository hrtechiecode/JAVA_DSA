package Java;
class basic {
    static int  a=20; //static variable
    int c=9;//instance variable -->always call by an object
    public static void main(String[] args) {
        int x;//declaration -->ek baar hota h
        x=50;//intialisation  -->kitni bhi baar kar sakte ho
        System.out.println(x);
        x=60;
        System.out.println(x);
        x=x+40;
        System.out.println(x);
        int y=10,z=20;
        System.out.println(y);
        System.out.println(z);
        int b=30;//local variable
        System.out.println("local variable" +b);
        System.out.println("static" +basic.a);//call static variable -->it is always call by class name
        basic obj=new basic();
        System.out.println("instance" +obj.c);
        System.out.println(70+8);
        System.out.println("70+8");
        char ch='q'; //not write like this "q"
        System.out.println(ch);

    }
}
