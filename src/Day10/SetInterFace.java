package Day10;

import java.util.*;

public class SetInterFace {
	public static HashSet<Integer> Creatset() {
		HashSet<Integer> set = new HashSet<>();
		set.add(50);
		set.add(40);
		set.add(30);
		set.add(10);
		set.add(20);

		
		return set;
	}

	public static void main(String[] args) {
		HashSet<Integer> set =  Creatset();
		
		System.out.println("HashSet elements :" + set);
		
		set.add(50);
		System.out.println("Remove the Element :"+set.remove(50));
		
		System.out.println("After remove :"+set );
		
		
		System.out.println("Check the Element :"+set.contains(50));
		
		System.out.println("Size the Element :"+set.size());
		
		set.clear();
		System.out.println("Empty the Element :"+set.isEmpty());

	}
}
