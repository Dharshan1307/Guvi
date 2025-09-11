package Day4;
import java.util.Scanner;
public class FirstNonRepeatingCharHomeW {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        sc.close();

	        int[] freq = new int[256]; 

	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            freq[ch]++;  
	        }

	     
	        char result = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (freq[ch] == 1) {
	                result = ch;
	                break;
	            }
	        }

	        if (result != 0)
	            System.out.println("First non-repeating character: " + result);
	        else
	            System.out.println("No non-repeating character found.");
	    }
}
