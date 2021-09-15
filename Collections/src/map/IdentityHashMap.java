package map;

import java.util.HashMap;
import java.util.Map;


public class IdentityHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new java.util.IdentityHashMap<>();
		
		Integer id1 = new Integer(10);
		Integer id2 =new Integer(10);
		
		map.put(id1, "basu");
		map.put(id2, "ankith");
		
		System.out.println(map);

	}

}
