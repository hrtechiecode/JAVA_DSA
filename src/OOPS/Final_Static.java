package OOPS;
public class Final_Static {
    public static class Cricketer{
     final String country="india";//cannot change
     int run;
     String name;
     static String country2="hongkong";
    }
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
       // c1.country="uk"; error
        System.out.println(c1.country);
        Cricketer c2=new Cricketer();
     c1.country2="india";
        System.out.println(c2.country2);
    }
}
