package sample_test;

public class DoWhileLoopSecondTestSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// way 1 array[0],array[1],array[2]
		int[] array = { 10, 20, 30, 40, 50}; // declare and initialization

		// do while loop
		System.out.println("======== Using do while loop ===========");

		System.out.println("Array size: " + array.length);

		int i = 4; // 1. initialization
		// In the first cycle, i = 0
		do {
			System.out.println(array[i]); //
			i = i - 1; // 2. decrement //
		} while (i >= 0); // 3. condition

		//sop("naveen"
	} // end of main method

} // end of class:DoWhileLoopTest
