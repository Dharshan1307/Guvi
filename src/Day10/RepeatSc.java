package Day10;

import java.util.*;

public class RepeatSc {

	public static ArrayList<Integer> createList() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter numbers add: ");
		int count = sc.nextInt();

		System.out.println("Enter the "+ count + "Elements");
		for (int i = 0; i < count; i++) {
			list.add(sc.nextInt());
		}

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
