package map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakhashMap {
	public static void main(String[] args) throws InterruptedException {
		
		Map<User,String> map = new WeakHashMap<>();
		User u = new User();
		map.put(u, "tom");
		
		System.out.println(map);
		
		u =null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(map);
		
	}
}
