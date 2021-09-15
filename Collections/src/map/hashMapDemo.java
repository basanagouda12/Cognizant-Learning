package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("john", 70);
		map.put("Tom", 60);
		map.put("Tim", 99);
		map.put("btad", 80);
		
		Set<String> keySet = map.keySet();
		System.out.println("keys:"+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("values:"+values);
		
		for (String key : keySet) {
			System.out.println("key:" + key + " value:"+ map.get(key));
		}

	}

}
