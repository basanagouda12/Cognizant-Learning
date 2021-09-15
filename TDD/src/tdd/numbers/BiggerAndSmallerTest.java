package tdd.numbers;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BiggerAndSmallerTest {
	
	private BiggerAndSmaller alogorithm;
	
	@Before
	public void setUp() {
		alogorithm = new BiggerAndSmaller();

	}
	
	private int[] nums(int...ns) {
		return ns;
		
	}
	@Test
	public void numbersInIncreasingOrder() {
		// TODO Auto-generated method stub
		
		alogorithm.find(nums(2,3,4));
		
		Assert.assertEquals(4, alogorithm.getBigger());
		Assert.assertEquals(2, alogorithm.getSmaller());
	}
	

	@Test
	public void numbersInDecresingOrder() {
		// TODO Auto-generated method stub
		
		alogorithm.find(nums(19,5,2,17,15,10));
		
		Assert.assertEquals(19, alogorithm.getBigger());
		Assert.assertEquals(2, alogorithm.getSmaller());
	}
	
	
	@Test
	public void onlyOneNumber() {
		// TODO Auto-generated method stub
		
		alogorithm.find(nums(19));
		
		Assert.assertEquals(19, alogorithm.getBigger());
		Assert.assertEquals(19, alogorithm.getSmaller());
	}

	

	@Test
	public void numbersRepeate() {
		// TODO Auto-generated method stub
		
		alogorithm.find(nums(19,5,2,17,15,10,19));
		
		Assert.assertEquals(19, alogorithm.getBigger());
		Assert.assertEquals(2, alogorithm.getSmaller());
	}

}
