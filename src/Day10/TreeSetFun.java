package Day10;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFun {
    public static Set<Integer> createSet() {
        TreeSet<Integer> set = new TreeSet<>();  
        set.add(50);
        set.add(40);
        set.add(30);
        set.add(10);
        set.add(20);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();

        System.out.println("TreeSet elements : " + set);

        set.add(50); 
        System.out.println("Remove element 50 : " + set.remove(50));

        System.out.println("After remove : " + set);

        System.out.println("Contains 50? : " + set.contains(50));

        System.out.println("Size : " + set.size());

        set.clear();
        System.out.println("Is empty? : " + set.isEmpty());

        System.out.println("After clear : " + set);
    }
}
