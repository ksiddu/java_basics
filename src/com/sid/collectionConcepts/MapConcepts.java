package com.sid.collectionConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://mkyong.com/java8/java-8-foreach-examples/

		Map<String, Integer> map = new HashMap<>();
		map.put("Siddu", 1);
		map.put("Ravi", 2);
		map.put("Raju", 3);
		map.put("Tom", 4);
		map.put("Andy", 5);

		// 1. through Map.Entry with map.entrySet()
		System.out.println("Map Elements: " + map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Map Key: " + entry.getKey());
			System.out.println("Map Value: " + entry.getValue());
		}

		// 2. through map.keySet()
		System.out.println("Map Elements: " + map);
		Set<String> set = map.keySet();

		for (String key : set) {
			System.out.println("Map Key: " + key);
			System.out.println("Map Value: " + map.get(key));
		}

		// 3. using forEach
		map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

	}

}
