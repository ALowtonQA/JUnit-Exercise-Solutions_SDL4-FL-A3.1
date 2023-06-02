package com.qa.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AnnotationExampleTest {

	// Only once
	// Before the tests within the class run
	@BeforeAll
	public static void setUp() {
		System.out.println("Before All");
	}
	
	// @Before - This is to be executed before EVERY @Test 
	@BeforeEach
	public void init() {
		System.out.println("Before Each Test");
	}
	
	// @Test - Labels the method as a Junit Test
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

//    @Disabled
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	// @After - Executed after EVERY @Test 
	@AfterEach
	public void after() {
		System.out.println("After Each Test");
	}
	
//	// @AfterAll - Executed once after all tests - This is ran LAST
	@AfterAll
	public static void tearDown() {
		System.out.println("After All");
	}

}
