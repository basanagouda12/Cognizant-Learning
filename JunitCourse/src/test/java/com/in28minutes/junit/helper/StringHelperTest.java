package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

	} 

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_basicNegetive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
