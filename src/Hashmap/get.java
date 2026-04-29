package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class get {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println( map.get(3));
        ArrayList<Integer>a=new ArrayList<>();
        a.add(2);
        a.add(2);
        a.add(2);
        for(int i=0;i<a.size();i++) {
            int num = a.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);}
        System.out.println(map); // prints the updated map
        System.out.println(map.get(2));
    }
}
