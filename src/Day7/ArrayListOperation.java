package Day7;

import java.util.*;

public class ArrayListOperation {

	public static void main (String [] dharhu) {

		ArrayList<Integer> arr = new ArrayList<Integer> ();

		System.out.println("Initail size" + arr.size());

		arr.add(10);

		arr.add(20);

		arr.add(30);

		arr.add(40);

		arr.add(50);

		arr.add(60);

		arr.add(70);

		arr.add(80);

		arr.add(90);

		arr.add(100);

		arr.add(1,400);

		System.out.println("After adding elments : " + arr);

		System.out.println("Size after insert : " + arr.size());

		System.out.println("Elements at index 2 : " +arr.get(2));

		arr.set(2, 100);

		System.out.println("Afer modifing index 2 " +arr);

		System.out.println("Contains 20 : " +arr.contains(20) );

		System.out.println("Index of 50 : " +arr.indexOf(50));

		arr.remove(Integer.valueOf(10));

		arr.remove(0);

		System.out.println("Afetr removals: " +arr);

		System.out.println("Iterating using for each : ");

		for (Integer num : arr)

			System.out.println((num + " "));

		arr.clear();

		System.out.println("Is Empty : " + arr.isEmpty());	

	}

}