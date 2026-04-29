package String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        System.out.println(str);
        System.out.println(str.length()  +" "+str.capacity());  //s.capacity();    16 + length("hello") = 21

        str.append(1);
        System.out.println(str);
        str.append('h');
        System.out.println(str);
        //hello -->mello
        str.setCharAt(0,'m');
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.insert(1,2));
        System.out.println(str.deleteCharAt(4));

        StringBuilder s=new StringBuilder(10);  //empty string
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);//empty string
        s.append("hritika");
        System.out.println(s.length()+" "+s.capacity());
        StringBuilder s2=new StringBuilder();  //empty string
        System.out.println(s2.length()+" "+s2.capacity());
        System.out.println(s2);//empty string
        s2.append("hritika");
        System.out.println(s2.length()+" "+s2.capacity());
    }
}
