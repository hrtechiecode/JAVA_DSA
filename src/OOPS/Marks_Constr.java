package OOPS;

public class Marks_Constr {

    static class StudentData {
        String name;
        int roll_no;
        int[] marks;

//        StudentData(int x) {
//            marks = new int[x];
//        }
StudentData(int []x) {
           marks = x;
       }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        StudentData s1 = new StudentData(arr);
       // StudentData s2 = new StudentData(2);

         s1.marks[0] = 100;
        System.out.println(arr[0]);

//        s1.marks[1] = 20;
//        s1.marks[2] = 30;
//        s1.marks[3] = 10;
//
//        s2.marks[0] = 50;
//        s2.marks[1] = 20;

//        System.out.println(s1.marks[0]);
    }
}
