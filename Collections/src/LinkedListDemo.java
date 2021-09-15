import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob[] = new Object[1000000];
		
		for(int i=0;i<ob.length;i++)
		{
			ob[i]=new Object();
		}
		
		List<Object> list = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object obs : ob) {
			list.add(obs);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("sec "+(end-start));

	}

}
