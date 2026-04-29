package OOPS;

public class Poly_forms {
    public static class Shinchan{
        void speak(){
            System.out.println("mein itna bhi khaas nhi");
        }
    }
    public static class Doreamon{
        void speak(){
            System.out.println("nobita tum apna kaam khud kyu nhi karte");
        }
    }
    public static class Kazama{
        void speak(){
            System.out.println("shinchan...........");
        }
    }
    public static void main(String[] args) {
     Shinchan s=new Shinchan();//object
        Doreamon d=new Doreamon();
        Kazama k=new Kazama();
        s.speak();
     d.speak();
    k.speak();
    }
}
