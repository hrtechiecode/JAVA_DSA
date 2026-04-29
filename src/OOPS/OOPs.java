package OOPS;

import java.util.Scanner;
// create datatype
class Student {
    String name;
    int rollNo;
    double cgpa;
    void print(){
        System.out.println(name+" "+rollNo+" "+cgpa);
    }
}
public class OOPs {

    // create datatype
//    public static class Student {
//        String name;
//        int rollNo;
//        double cgpa;
//    }

    public static void main(String[] args) {

        Student s1 = new Student(); // object create
        s1.name = "Diana";
        s1.rollNo = 186;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // object create
        s2.name = "Nobita";
        s2.rollNo = 187;
        s2.cgpa = 8.29;
//.print,initialize,update value
        Student s3 = new Student(); // object create
        Scanner sc=new Scanner(System.in);
        s3.name = "Shizuka";
        System.out.println("take i/p of roll no.");
        s3.rollNo = sc.nextInt();
        s3.cgpa = 8.79;

         Student s4=s1;//s4 shallow copy of s1(can control)
        s4.name="deny";
        System.out.println(s1.name);

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rollNo);
        s2.cgpa=9.2;
        System.out.println(s2.cgpa);
        System.out.println(s2.name);
        System.out.println(s3.name+" "+s3.rollNo);
        s1.print();
        s2.print();
        s3.print();
print(s1);
    }
    public  static void  print(Student s){ //harr file m banana pad sakta h
        System.out.println(s.name+""+s.cgpa+""+s.rollNo);
    }
}

