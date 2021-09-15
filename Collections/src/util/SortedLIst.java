package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");
//		l.add("M");
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println("after sorting " + l);
		
		int result =Collections.binarySearch(l, "X");
		
		System.out.println("Index of Element "+ result);

	}

}
