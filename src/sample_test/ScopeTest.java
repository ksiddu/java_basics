package sample_test;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10, 20, 30, 40, 50, 60};
		

		// int size = array.length;// intermediate, stores value 6
		
		for(int i = 0; i < array.length; i++) {
			// local scope of variable i: available to only for loop
			System.out.println(array[i]);
			System.out.println("for loop i value: "+ i);
		}
		
		//System.out.println("After for loop ends");
		
		// global scope of variable i: available to the entire class
		int i = 20;
	    System.out.println(" i value outside for loop:"+ i);
		
		
		
		
		// single value requirement, declare variable
		// multiple values requirement : scores of a student, declare an array
				

	}

}
