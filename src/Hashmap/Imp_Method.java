package Hashmap;

import Recursion.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Imp_Method {
    public static int countpairsum(ArrayList<Integer>l,int target){
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<l.size();i++){
            int num=l.get(i);
            int comp=target-l.get(i);
            if(map.containsKey(comp)){
                count+=map.get(comp);
            }
           // map.put(l.get(i), i);  if no duplicate
            //if duplicate exist
            map.put(num,  map.getOrDefault(num,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(2);
        l.add(2);
        int target=4;
        System.out.println(countpairsum(l,target));

    }
}
