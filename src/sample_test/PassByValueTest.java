package sample_test;

public class PassByValueTest {

	// Ref: https://www.softwaretestinghelp.com/java/java-pass-by-reference-and-pass-by-value/
	
	// primitive data types: int, long , double
	
	
	
	
	// method definition
	public void greeting(String name) {
		System.out.println("Hi "+ name);
	}
	
	// method definition
	public int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueTest obj1 = new PassByValueTest();
		//obj1.greeting("Naveen");
		
		int result = obj1.sum(10, 20); // method call a =10, b=20
		System.out.println("Sum of 2 numbers is  "+ result);
	}

}
