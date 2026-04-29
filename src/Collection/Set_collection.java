package Collection;

import java.util.*;

public class Set_collection {
    //unordered unique
    static void hashset(){//efficient
                Set<String> fruits = new HashSet<>(); //unique elements  ,unordered

                // Add elements
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Mango");
                fruits.add("Apple"); // Duplicate, ignored

                System.out.println("Fruits: " + fruits); // Unordered, no duplicates

                // Check element
                System.out.println("Contains Mango? " + fruits.contains("Mango"));

                // Remove
                fruits.remove("Banana");

                // Iterate
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }
            }
            //sorted
    static void treeset(){ //less efficient
        Set<Integer> treeSet = new TreeSet<>(); //sorted
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println(treeSet); // Output: [10, 20, 30] — sorted

    }
    //ordered
static void linkedset(){
    Set<String> orderedSet = new LinkedHashSet<>();//less efficient than hashset
    orderedSet.add("A");
    orderedSet.add("C");
    orderedSet.add("B");
    orderedSet.add("A"); // Duplicate, ignored
    System.out.println(orderedSet); // Output: [A, C, B]
}
    public static void main(String[] args) {
        hashset();
        treeset();
        linkedset();
    }
    }
