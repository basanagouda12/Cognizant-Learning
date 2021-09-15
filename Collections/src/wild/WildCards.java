package wild;

import java.util.ArrayList;

import java.util.stream.Collectors;


public class WildCards {
	
	public static void main(String[] args) {
		WildCards w = new WildCards();
		w.myMethod(new ArrayList<Thread>());
	}
	
	public void myMethod(ArrayList<? extends Thread> l) {
		l.add(null);
		
	}

}
