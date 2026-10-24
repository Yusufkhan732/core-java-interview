package collection.copy;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(1, 21);
		map.put(2, 20);
		map.put(null, null);
		map.put(3, 90);

		System.out.println(map);

		// Retrieve and print values based on keys
		System.out.println(map.get(2));

		// Check if a key is present in the map
		System.out.println(map.containsValue(90));
		System.out.println(map.containsKey(3));

		// Iterate over the keys and values in the map
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		for (int i = 1; i <= map.size(); i++) {

			System.out.println(map.get(i));

		}
	}
}