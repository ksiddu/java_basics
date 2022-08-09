package sample_test;

public class ArraysAndLoopsTest {

	public static void main(String[] args) {

		int numbersArray[] = { 4, 2, 7, 9, 1 };

		// for loop
		System.out.println("======== Using for loop===========");
		for (int i = 0; i < numbersArray.length; i++) {

			System.out.println(numbersArray[i]);
			// System.out.println("value :" + numbersArray[i] + " index :"+ i);
		}

		// while loop
		System.out.println("======== Using while loop===========");
		int j = 0;
		while (j < numbersArray.length) {
			System.out.println(numbersArray[j]);
			j++;

		}

		// do while loop
		System.out.println("======== Using do while loop===========");
		int k = 0;
		do {
			System.out.println(numbersArray[k]);
			k++;

		} while (k < numbersArray.length);
	}
}