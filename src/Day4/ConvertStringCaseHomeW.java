package Day4;
import java.util.Scanner;
public class ConvertStringCaseHomeW {

	public static void main(String[]args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your String :");
		String input = sc.nextLine();

		StringBuilder result = new StringBuilder();
		
		for(int i = 0 ;i < input.length() ; i++) {
			char ch = input.charAt(i);
		if(ch >= 'A' &&  ch <= 'Z') {
			ch = (char)(ch + 32);
		}else if(ch >='a' &&  ch <= 'z') {
			ch = (char)(ch - 32);
		}
		result.append(ch);
		}
		System.out.println("Original :"+ input);
		System.out.println("Convert String :"+ result.toString());
	}
}
