package Day10;

import java.util.*;

public class StringRepeact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        Set<Character> repeat = new HashSet<>();

        for (char charter : str.toCharArray()) {
            if (!seen.add(charter)) {   
                repeat.add(charter);
            }
        }

        System.out.println("Repeated characters: " + repeat);
    }
}
