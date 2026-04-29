package Collection;
import java.util.*;
public class Arraylistcollection {
    //reverse list
    public static void reverselist(ArrayList<Integer>list)
    {
      int i=0,j=list.size()-1;
      while(i<j){
          Integer temp=Integer.valueOf(list.get(i));
          list.set(i,list.get(j));
           list.set(j,temp);
          i++;
          j--;
      }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        //adding elements
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(10);
        l.add(5);
        l.add(20);

        // Sort in ascending order
        Collections.sort(l);
        System.out.println("Sorted ascending: " + l);

        // Sort in descending order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Sorted descending: " + l);

        //print without loop
        System.out.println(l);

        //to get element at index i
        System.out.println("to get element at index i "+l.get(0));

        //print with for loop
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        //add element at idx
        l.add(0,5);
        System.out.println("add element at idx "+l);

        //modify
        l.set(1,10);
        System.out.println("modify "+l);

        //remove
        l.remove(1);
        System.out.println("remove "+l);

        //remove element e
        l.remove(Integer.valueOf(5));
        System.out.println("remove element "+l);

        //checking element exist or not
        boolean ans=l.contains(Integer.valueOf(2));
        System.out.println("checking element exist or not "+ans);

        //if you don't specify class, you can put anything inside l
        ArrayList l2=new ArrayList();
        l2.add("hello") ;
        l2.add(1) ;
        l2.add(true) ;
        System.out.println(l2);
        Collections.reverse(l2);
        System.out.println(l2);

        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i< 5;i++){
            list.add(i);
        }
        System.out.println("original list "+list);
        reverselist(list);
        System.out.println("reverse list "+list);

ArrayList<String> str=new ArrayList<>();
str.add("shinchan");
str.add("doreamon");
str.add("chota bheam");
str.add("perman");
        // Sort in ascending order
        Collections.sort(str);
        System.out.println("Sorted ascending: " + str);
        // Sort in descending order
        Collections.sort(str, Collections.reverseOrder());
        System.out.println("Sorted descending: " + str);

    }
}

