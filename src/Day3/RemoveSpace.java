package Day3;

public class RemoveSpace {
	
	public static void main (String[] args) {
		String str = "Hello World";
		char[] cha_arr = str.toCharArray();
		String res ="";
		for (char c : cha_arr) {
			if( c != ' ') {
				res = res+c ;
			}
		}

   System.out.println("Original String = "+str);
   System.out.println("Without space = "+res);
}
}