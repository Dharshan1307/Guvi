package Day10;

import java.util.*;
public class UniqueValue {
	public static ArrayList<Integer> CreatUnqe(){
		ArrayList<Integer> list = new ArrayList();
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
	public static void main(String[]args) {
		ArrayList<Integer> list = CreatUnqe();
		
		 System.out.println("Original List: " + list);
		 
		 Set <Integer> arr = new LinkedHashSet<>(list);
		 System.out.println("Unique Value :" +arr);

	}
}
