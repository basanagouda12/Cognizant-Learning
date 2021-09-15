package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAndAfter {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.println("test1 excecuted");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 excecuted");
	}
	
	@After
	public void teardown() {
		System.out.println("after test");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
}
