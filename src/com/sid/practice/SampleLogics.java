package com.sid.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

	public static void reverseANumber(int n) {
		int rev = 0;
		int org = n;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;

		}

		System.out.println("Original Number: " + org);

		System.out.println("Reversed Number: " + rev);

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

	// sort map by value using tree set and linked hashmap value is a integer
	public static void sortMapByValue1(Map<String, Integer> map) {

		Set<Integer> set = new TreeSet<Integer>(); // to sort the values in increasing order
		Map<String, Integer> newMap = new LinkedHashMap<String, Integer>();

		for (Integer n : map.values()) {
			set.add(n);
		}
		System.out.println("Sorted Set values: " + set);

		for (int i : set) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == i) {
					newMap.put(entry.getKey(), entry.getValue());
				}
			}
		}

		System.out.println("Original Map: " + map);
		System.out.println("Sorted Map: " + newMap);

	}

	// sort map by value using list and linked hashmap - value is a integer
	public static void sortMapByValue2(Map<String, Integer> map) {

		Set<Integer> set = new TreeSet<Integer>(); // to sort the values in increasing order
		Map<String, Integer> newMap = new LinkedHashMap<String, Integer>();

		ArrayList<Integer> list = new ArrayList<Integer>(map.values());

		Collections.sort(list);
		System.out.println("Sorted List values: " + list);

		for (int i : list) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == i) {
					newMap.put(entry.getKey(), entry.getValue());
				}
			}
		}

		System.out.println("Original Map: " + map);
		System.out.println("Sorted Map: " + newMap);

	}

	// sort map by value using list and linked hashmap - value is a string
	public static void sortMapByValue3(Map<String, String> map) {

		Map<String, String> newMap = new LinkedHashMap<String, String>();

		ArrayList<String> list = new ArrayList<String>(map.values());

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1).compareTo(o2);

			}

		});
		System.out.println("Sorted List values: " + list);

		for (String i : list) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				if (entry.getValue() == i) {
					newMap.put(entry.getKey(), entry.getValue());
				}
			}
		}

		System.out.println("Original Map: " + map);
		System.out.println("Sorted Map: " + newMap);

	}

	public static void main(String[] args) {

		// even or odd
		SampleLogics.evenOrOdd(4);
		SampleLogics.evenOrOdd(5);

		// prime or not
		SampleLogics.isPrime(7);
		SampleLogics.isPrime(4);

		// reverse A Number
		SampleLogics.reverseANumber(123);

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

		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();

		map1.put("A", 100);
		map1.put("B", 102);
		map1.put("C", 101);
		map1.put("D", 101);

		SampleLogics.sortMapByValue1(map1);
		SampleLogics.sortMapByValue2(map1);

		HashMap<String, String> map2 = new HashMap<>();

		map2.put("2", "B");
		map2.put("8", "A");
		map2.put("4", "D");
		map2.put("7", "F");
		map2.put("6", "W");
		map2.put("19", "J");
		map2.put("1", "Z");

		SampleLogics.sortMapByValue3(map2);
	}

}
