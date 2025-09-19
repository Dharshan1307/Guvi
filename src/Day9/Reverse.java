package Day9;

import java.util.*;

public class Reverse {
	public static ArrayList<Integer> creatList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = creatList();
		for (int i = arr.size() -1; i >= 0; i--) {
			System.out.print(arr.get(i));
			if (i != 0) {
				System.out.print(",");
			}
		}
	}
}
