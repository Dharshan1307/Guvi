package Day3;

public class MarkNormalizer {

	public static void main(String[]str)
	    {
		int [] marks = {95,76,88, 100 };		
		for (int i=0 ; i < marks.length ; i++) 
		{
			System.out.println(marks[i]+"\t");
			marks[i]= Math.min(100,marks[i]+5);
		}
		
		System.out.println("Affter Adding 5\n");
		
		for (int i : marks)
		{
			System.out.println(i);
		}
	}
}
