package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		// Arrange
		Calculator calc = new Calculator();
		
		// Act & Assert
		// assertEquals(expected, actual);
		assertEquals(15, calc.add(11, 4));
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.subtract(20, 10));
	}
	
	@Test
	public void conditionalCalcTrueTest() {
		Calculator calc = new Calculator();
		assertEquals(12, calc.conditionalCalc(10, 2, true));
	}
	
	@Test
	public void conditionalCalcFalseTest() {
		Calculator calc = new Calculator();
		assertEquals(8, calc.conditionalCalc(10, 2, false));
	}
}
