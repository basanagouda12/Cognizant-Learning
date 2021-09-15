import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MAXColor {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(1);
		
		Collections.sort(l);
		
		int sum =0;
		int result =0;
		int m = 7;
		
		for (Integer i : l) {
			if((sum+i)< m) {
				sum=sum +i;
				result++;
			}else {
				continue;
			}
		}
		
		System.out.println(result);
		
		String s1 = "aaa";
		
		String[] arrOfStr = s1.split("");
		
		for (String i : arrOfStr) {
			
		}
		
		char s ='a';
		int n = s;
		
		System.out.println(n);
		
	
		
		

	}

}
