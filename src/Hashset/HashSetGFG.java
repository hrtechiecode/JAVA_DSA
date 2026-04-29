package Hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetGFG {
    public static void main(String[] args) {
        HashSet<Integer>hash=new HashSet<>();//unordered set
        hash.add(20);hash.add(50);hash.add(90);hash.add(10);hash.add(30);
        System.out.println(hash.size());
        System.out.println("unordered "+hash);
        System.out.println(hash.contains(50));
        hash.remove(10);
        System.out.println(hash);

        TreeSet<Integer>hash2=new TreeSet<>();//unordered set   logn
        hash2.add(20);hash2.add(50);hash2.add(90);hash2.add(10);hash2.add(30);
        System.out.println("ordered "+hash2);
        System.out.println(hash2.contains(50));
        hash2.remove(10);
        System.out.println(hash2);


    }
}
