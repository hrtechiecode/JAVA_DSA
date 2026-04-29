package String;

import java.util.ArrayList;

public class String_2 {
    public static void change(String s) {
        s = "tom";//pass by value
    }

    public static void change2(ArrayList<String>l) {
        l.add("anny");
    }
    public static void main(String[] args) {
        String s="rose";
        change(s);
        System.out.println(s);
        String []arr={"rose,rosy,carrie,devil,daisy"};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        ArrayList<String>l=new ArrayList();
        l.add("roy");
        l.add("daisy");
        l.add("tany");
        l.add("joy");
        System.out.println(l);
        change2(l);
        System.out.println(l);
    }
}
