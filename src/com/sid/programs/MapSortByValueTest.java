package com.sid.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapSortByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Order a given dictionary order by the its value
		// Input: {“BNB”:1, “BTC”:20, “ETH”:3}

		// Output: {“BNB”:1,“ETH”:3, “BTC”:20}

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		Map<String, Integer> ouput = new LinkedHashMap<String, Integer>();

		map.put("BNB", 1);
		map.put("BTC", 20);
		map.put("ETH", 3);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		List<Integer> list = new ArrayList(map.values());

		Collections.sort(list);
		System.out.println(list);

		Set<String> set = map.keySet();
		System.out.println(set);

		// list = 1, 3, 20
		//

		for (int value : list) {

			for (Map.Entry<String, Integer> entry : map.entrySet()) {

				if (entry.getValue() == value) {
					// System.out.println(entry.getKey(), entry.getValue())
					ouput.put(entry.getKey(), entry.getValue()); // “BNB”:1, “ETH”:3, BTC”:20
					break;
				}
			}

		}
		
		for (Map.Entry<String, Integer> entry : ouput.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
