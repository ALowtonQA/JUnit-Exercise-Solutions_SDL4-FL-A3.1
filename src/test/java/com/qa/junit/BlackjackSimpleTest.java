package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackSimpleTest {

	@Test
	public void dealerBustTest() {
		// assertEquals(expected, actual)
		assertEquals(21, BlackjackSimple.play(22, 21));
	}
	
	@Test
	public void playerBustTest() {
		assertEquals(21, BlackjackSimple.play(21, 22));
	}
	
	@Test
	public void bothBustTest() {
		assertEquals(0, BlackjackSimple.play(22, 22));
	}
	
	@Test
	public void highestValueWinsTest() {
		assertEquals(18, BlackjackSimple.play(18, 17));
	}
	
}
