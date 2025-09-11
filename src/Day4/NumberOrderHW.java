package Day4;
import java.util.Arrays;
import java.util.Scanner;
public class NumberOrderHW {
	 
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter any number: ");
	        String numStr = sc.nextLine();   // read as string to keep leading zeros

	        char[] digits = numStr.toCharArray();
	        Arrays.sort(digits);             // ascending sort

	        System.out.print("Digits ascending : ");
	        System.out.println(new String(digits));

	        System.out.print("Digits descending: ");
	        for (int i = digits.length - 1; i >= 0; i--) {
	            System.out.print(digits[i]);
	        }
	        System.out.println();

	        sc.close();
	    }
}
