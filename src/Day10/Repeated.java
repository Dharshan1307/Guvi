package Day10;

import java.util.*;

public class Repeated {

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = createList();
        System.out.println("Original List : " + list);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>(); 

        for (int n : list) {
            if (!seen.add(n)) {       
                duplicates.add(n);
            }
        }

        System.out.println("Repeated Values : " + duplicates);
    }
}
