package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverseDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(8);
		l.add(12);
		l.add(1);
		
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

		
	}
}
