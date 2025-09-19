package Day9;

import java.util.*;

public class Arraylist {
	public static ArrayList<Integer> createArray() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(50);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		arr.add(90);
		return arr;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = createArray();

		arr.add(2, 500);
		System.out.println("Array Add  : " + arr);

		System.out.println("Array Access  : " + arr.get(2));

		arr.set(5, 100);
		System.out.println("After Modification  : " + arr);

		arr.remove(4);
		System.out.println("Remove : " + arr);

		System.out.println("Array Size : " + arr.size());

		System.out.println("Search Element : " + arr.contains(50));

		for (int num : arr) {
			System.out.println(num + " ");
		}

		int multi = 1;
		for (int num : arr) {
			multi *= num;
		}
		System.out.println("Array multi Total : " + multi);

		// Start
		int totalvalue = 0;
		for (int num : arr) {
			totalvalue += num;
		}
		System.out.println("Array Total : " + totalvalue);

		int target = 500;
		if (arr.contains(target)) {
			System.out.println("Target True :" + target);
		} else {
			System.out.println("Target False :" + target);
		}

		arr.clear();
		System.out.println("Array Clear : " + arr.isEmpty());

	}
}
