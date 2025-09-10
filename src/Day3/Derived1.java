package Day3;

public class Derived1 extends Base1 {

	 int b,tot;
	 Derived1 (int a,int b)
	 {
		 super(a);
		 this.b=b;
	 }
	public void sum()
	 { 
		tot=a+b;
		System.out.println("Total="+tot);
	 }
	public static void main(String[]str) 
	 {
		
		Derived1 obj1 =new Derived1(3,4);
		obj1.sum();
	 }
 }
