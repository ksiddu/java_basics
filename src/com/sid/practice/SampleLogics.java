package com.sid.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class SampleLogics {

	public static void evenOrOdd(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is a even number");
		} else {
			System.out.println(n + " is a odd number");
		}
	}

	public static void isPrime(int n) {

		boolean flag = true; // initially assume the given number is prime
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;

			}
		}
		if (flag) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static void reverseStringBruteForce(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Original String: " + str);

		System.out.println("Reversed String: " + rev);

	}

	public static void reverseStringByStringBuilder1(String str) {

		// StringBuilder builder = new StringBuilder(str);

		// String rev = builder.reverse().toString();

		StringBuilder builder = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			builder.append(str.charAt(i));
		}
		String rev = builder.toString();
		System.out.println("Original String: " + str);

		System.out.println("Reversed String: " + rev);

	}

	public static void reverseStringByStringBuilder2(String str) {
		StringBuilder builder = new StringBuilder(str);

		String rev = builder.reverse().toString(); // using direct reverse() method

		System.out.println("Original String: " + str);

		System.out.println("Reversed String: " + rev);

	}

	public static String reverseStringByRecursive(String str) {

		if (str.isEmpty()) {
			return str;
		}

		return reverseStringByRecursive(str.substring(1)) + str.charAt(0);

	}

	// BruteForce approach
	public static void removeDuplicateCharacters1(String str) {

		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			if (!newString.contains(String.valueOf(str.charAt(i)))) {
				newString = newString + str.charAt(i);
			}
		}

		System.out.println("Original String: " + str);
		System.out.println("No Duplicate Chars String: " + newString);

	}

	// Collection approach
	public static void removeDuplicateCharacters2(String str) {

		char[] charArray = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		String newString = "";

		for (char c : charArray) {
			set.add(c);

		}

		for (Character c : set) {
			newString = newString + c;
		}

		System.out.println("Original String: " + str);
		System.out.println("No Duplicate Chars String: " + newString);

	}

	public static void main(String[] args) {

		// even or odd
		SampleLogics.evenOrOdd(4);
		SampleLogics.evenOrOdd(5);

		// prime or not
		SampleLogics.isPrime(7);
		SampleLogics.isPrime(4);

		// reverse a string by BruteForce method
		SampleLogics.reverseStringBruteForce("Car");

		// reverse a string by StringBuilder1 method
		SampleLogics.reverseStringByStringBuilder1("Bike");

		// reverse a string by StringBuilder2 method
		SampleLogics.reverseStringByStringBuilder2("Flight");

		// reverse a string by Recursive method
		String str = "Java";
		String rev = SampleLogics.reverseStringByRecursive(str);
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + rev);

		// remove Duplicate Characters - BruteForce approach
		SampleLogics.removeDuplicateCharacters1("Selenium");

		// remove Duplicate Characters - Collection approach
		SampleLogics.removeDuplicateCharacters2("Automation");

	}

}
