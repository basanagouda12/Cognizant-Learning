package Navigable;

import java.util.TreeSet;

public class NaviagbleTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s = new TreeSet<>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println(s);

		System.out.println(s.ceiling(20));

		System.out.println(s.higher(40));

		System.out.println(s.floor(10));

		System.out.println(s.lower(30));

		System.out.println(s.pollFirst());

		System.out.println(s.pollLast());

		System.out.println(s.descendingSet());

	}

}
