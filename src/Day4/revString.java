package Day4;

public class revString {

	 public static void main(String[] args) {
	        String str = "Dharshan";
	        String rev = "";

	      
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + rev);
	    }
}
