package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void assertEqualsTest() {
		boolean boo = false;
		// Assert that expected value is equal to actual value
		//          (expected, actual)
		assertEquals(true, boo, "Expected boo to be true");
	}
	
	@Test
	public void assertTrueTest() {
		boolean boo = true;
		assertTrue(boo, "Expected: Flag set to true");
	}
	
	@Test
	public void assertFalseTest() {
		boolean boo = false;
		assertFalse(boo, "Expected: Flag set to false");
	}
	
	@Test
	public void assertNullTest() {
		Object obj = null;
		assertNull(obj, "Expected null object");
	}
	
	@Test
	public void assertNotNullTest() {
		Object obj = "Hello";
		assertNotNull(obj, "Expected not null object");
	}

//	@Test
//	public void assertSameTest() {
//		String obj1 = "Anoush Lowton";
//		String obj2 = obj1;
//		
//		assertSame("Expected both objects to be the same", obj1, obj2);
//	}
//	
//	@Test
//	public void assertNotSameTest() {
//		String obj1 = "Alpha";
//		String obj2 = "Beta";
//		
//		assertNotSame("Expected the objects to NOT be the same", obj1, obj2);
//	}
	
}
