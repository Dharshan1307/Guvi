package AEC;
import java.util.Scanner; 
public class Digite {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num >= 0 && num <= 9) {
	            System.out.println("One Digit Number");
	        } else if (num >= 10 && num <= 99) {
	            System.out.println("Two Digit Number");
	        } else if (num >= 100 && num <= 999) {
	            System.out.println("Three Digit Number");
	        }  else {
	            System.out.println("Not Found");
	        }
	    }
}
