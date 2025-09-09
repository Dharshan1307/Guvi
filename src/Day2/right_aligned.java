package Day2;

import java.util.Scanner;

public class right_aligned {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        for (int i = n; i >= 1; i--) { 
	            // spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
