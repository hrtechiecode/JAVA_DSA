package Java;

import java.util.ArrayList;

//plateform independent
public class Variables {
    public static void main(String[] args) {
        System.out.print("Hi Hritika");
        System.out.println("currently persuing B-Tech "); //line change
     //   System.out.println(args[0]);
        //Datatype Variable
        //premitive
        int a=10;
        int b=1;
        float c=1.2f;
        //int d=1.2f;
        //non premintive
        String e="holla";
        ArrayList<Integer>a2=new ArrayList<>();

        System.out.println(a);
        System.out.println(a+b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(a2);
        System.out.println("typecasting");
        //automatic typecasting
        float f=2.32f;
        double d=f;
        System.out.println(f);
        System.out.println(d);
        //manual typecasting
         float f2=1.3f;
//        int x=f2;
        int x=(int)f2;
        System.out.println(x);
        //advance typecasting -->primitive to non primitive and
        // P to NP and object to string and obj to list
        System.out.println("p to np");
        int x2=2;
       // String y=x2;
        String y=String.valueOf(x2);
        System.out.println(y);
        System.out.println(y+y);
        System.out.println(x2+x2);// concatanation
//np to p
        System.out.println("np to p");
        String s="2";
      //  int i=s;
        int i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(s+s);
        System.out.println(i+i);
        //jagged array
        //rows are fixed but column are not fixed
        int[][]jagged=new int[2][];
        jagged[0]=new int []{1,2,3};
        jagged[1] = new int[]{4, 5};

        // Print the elements of the jagged array
     for (int i2 = 0; i2 < jagged.length; i2++) {
         for (int j = 0; j < jagged[i2].length; j++) {
                System.out.print(jagged[i2][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
 


}
