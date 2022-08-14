package sample_test;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// way 1      array[0],array[1],array[2]
		int[] array = {10, 20, 30, 40, 50}; // declare and initialization
		// array[0] = 10
		// array[1] = 20
		// array[2] = 30
		// array[3] = 40
		// array[4] = 50
		// if there are n(5) elements/values in an array, 
		// then last value index will be n-1(4)

		
		// do while loop
		System.out.println("======== Using do while loop ===========");

		System.out.println("Array size: " + array.length);

		// do while loop syntax
		// 1.initialization
		// do{
		// System.out.println();
		// 2.increment/decrement
		// 3.} while(condition)

		int i = 0; // 1. initialization
		// In the first cycle, i = 0
		do {       
			System.out.println(array[i]); // i = 1
			i = i + 1; // 2. increment // i = 2
		} while (i < array.length); // 3. condition
                // i < 5
		System.out.println("Naveen");

	} // end of main method

} // end of class:DoWhileLoopTest

//In the first cycle, when i = 0, sop prints array[0], that is 10
//Then second line increments i value by 1, now i value is 1
//then it checks for condition, that is 1 < 5, it is true, then the control goes to do block again


//In the second cycle, when i = 1, sop prints array[1], that is 20
//Then second line increments i value by 1, now i value is 2
//then it checks for condition, that is 2 < 5, it is true, then the control goes to do block again