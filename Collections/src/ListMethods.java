import java.util.ArrayList;

import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		
		System.out.println("List: "+list);
		
		list.add(2, 100);
		
		System.out.println("List: "+list);
		list.set(3, 200);
		System.out.println("List: "+list);
		
		List<Integer> secList = new ArrayList<>();
		secList.add(111);
		secList.add(222);
		secList.add(333);
		
		System.out.println("List: "+secList);
		
		list.addAll(4, secList);
		
		System.out.println("List: "+list);
		
		System.out.println(list.contains(222));
		
		
		System.out.println("Elements");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		
		System.out.println("List: "+list);

	}

}
