package OOPS;
//encapsulation  👉 Data + Methods ko ek class ke andar bind karna
//👉 aur data ko direct access se protect karna
class Students{
    String name;//null
    private int roll_no;//0
    double percent;//0.0
//   private void print(){  //we cannt access if method is also private
//        System.out.println(name+" "+roll_no+" "+percent);
//    }
    void print(){//getter
        System.out.println(name+" "+roll_no+" "+percent);
    }
//    void p(){
//       print();
//    }
    void getRoll_no(){
        System.out.println(roll_no);
    }
    void setRoll_no(int x){ //setter
        roll_no=x;
    }
}

public class Private_Keyword {
    public static void main(String[] args) {
       Students s=new Students();
      s.print();
      // s.p();
      // s.roll_no=186;
       s.name="hritika";
       s.percent=93.4;
//        System.out.println(s.percent);
//        System.out.println(s.name);
       // System.out.println(s.roll_no);
        s.print();
       // s.p();
        s.getRoll_no();
        s.setRoll_no(60);
        s.print();
    }
}