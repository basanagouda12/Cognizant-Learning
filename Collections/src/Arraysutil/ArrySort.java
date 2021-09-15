package Arraysutil;

import java.util.Arrays;
import java.util.List;



public class ArrySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {40,25,1,8,56};
		
		System.out.println("befror");
		
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("befror");
		Arrays.sort(a);

		for (int i : a) {
			System.out.println(i);
		}
		
		List<int[]> asList = Arrays.asList(a);
		
		System.out.println(asList);

	}

}
