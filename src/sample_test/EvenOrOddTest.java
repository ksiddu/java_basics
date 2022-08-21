package sample_test;

public class EvenOrOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// odd : 1, 3, 5, 7, 9
		// even : 2, 4, 6, 8
		int number1 = 4, number2 = 7;
		
		String result1, result2 = number2+ "is even";;
		// using ternary operator
		result1 = (number1 % 2 == 0) ? "even" : "odd";
		System.out.println(result1);


		if (number2 % 2 == 0) {
			result2 = number2+ " is even";
		} else {
			result2 = number2+ " is odd";
		}
		
		System.out.println(result2);
	}

}
