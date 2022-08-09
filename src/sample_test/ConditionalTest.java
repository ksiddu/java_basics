package sample_test;

public class ConditionalTest {

	// problem 1
	// Time: 24 hours format
	// print good morning if time is 6am - 12pm
	// print good afternoon if time is 12pm - 6pm
	// print good evening if time is after 6 pm

	// format 1 : if else if else if... else
	// if
	// else if
	// else if
	// else if
	// else

	// problem 2 : Greater number
	// format 2 : if else
	// if
	// else

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 20;
		if (time >= 6 && time <= 12) {
			System.out.println("good morning");
		} else if (time > 12 && time <= 18) {
			System.out.println("good afternoon");
		} else {
			System.out.println("good evening");
		}

		// problem 2
		int a = 20;
		int b = 30;
		// biggest number

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		// problem 3: Greater of 3 numbers
		int x = 80, y = 200, z = 100;

		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else if (z > x && z > y) {
			System.out.println("z is greater");
		}

		// Truth table values
		// && : true, true == true, true,false == false
		// || : anyone is true == true
		
		int personAge = 26;
		// Age between 12 to 18 : Teenage
		// Age 18 to 30: Young age
		// Age > 30 : Old age

		if(personAge>=12 && personAge<=18) {
			System.out.println("Teenage");
		}
		else if(personAge>18 && personAge<=30) {
			System.out.println("Young age");
		}
		else if(personAge>30) {
			System.out.println("Old age");
		}
	}
}
