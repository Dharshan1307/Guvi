package Day9;

import java.util.*;

public class FindoddEven {
	public static void oddeven(int[] num) {
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for (int n : num) {
			if (n % 2 == 0) {
				even.add(n);
			} else {
				odd.add(n);
			}
		}
		System.out.println("Array even number :" + even);
		System.out.println("Array odd number :" + odd);

	}

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		oddeven(number);
	}
}
