package Collection;

import java.util.ArrayList;

//a class whose object contains or wraps PDT
public class Wrapper_class {
    public static void main(String[] args) {
    int x=Integer.parseInt("123");//static
    System.out.println(x);
    int y=Integer.valueOf("110110",2);//static  valueOf(binary number ,base)
    System.out.println(y);
    //wrapper class
        Integer a= Integer.valueOf(6);
        System.out.println(a);
        Float f=Float.valueOf(10.3f);
        System.out.println(f);
//ArrayList  --> ArrayList is a resizable (dynamic) array in Java.
//Size fixed nahi hota, runtime pe grow/shrink hota hai.
        ArrayList<Integer> list = new ArrayList<>();
//Faster than LinkedList for get/set
      //add elements
        list.add(10);
        list.add(20);
        list.add(30);
        //get element
        System.out.println( list.get(1));
        //print all elements
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //print list without loop
        System.out.println(list);

        //size
        System.out.println("size "+list.size());

        //add at any index
        list.add(2,110);
            System.out.println("list after insert an element at given idx "+list);

            //modify at idx
        list.set(1,100);
        System.out.println(list);

        //remove element idx
        list.remove(0);
        System.out.println(list);

        //remove an element if we dont know idx
        list.remove(Integer.valueOf(100));
        System.out.println(list);

        //checking if element present in a list or not
        boolean ans=list.contains(Integer.valueOf(30));
        System.out.println(ans);


        //if we dont specify the class, then we put anything
        ArrayList l=new ArrayList();
        l.add("hritika");
        l.add(5.6f);
        System.out.println(l);

    }
}
/* Primitive | Wrapper     |
        | --------- | ----------- |
        | `int`     | `Integer`   |
        | `float`   | `Float`     |
        | `double`  | `Double`    |
        | `char`    | `Character` |
        | `boolean` | `Boolean`   |
        | `byte`    | `Byte`      |
        | `short`   | `Short`     |
        | `long`    | `Long`      |*/
