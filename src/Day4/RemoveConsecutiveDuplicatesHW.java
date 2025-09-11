package Day4;
import java.util.Scanner;
public class RemoveConsecutiveDuplicatesHW {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        sc.close();

	        if (input.isEmpty()) {
	            System.out.println("Modified string: ");
	            return;
	        }

	        StringBuilder result = new StringBuilder();
	        result.append(input.charAt(0)); 

	        for (int i = 1; i < input.length(); i++) {
	          
	            if (input.charAt(i) != input.charAt(i - 1)) {
	                result.append(input.charAt(i));
	            }
	        }

	        System.out.println("Modified string: " + result.toString());
	    }
}
