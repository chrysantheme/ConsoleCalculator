package ch.bbw.ss.ConsoleCalculator;

/**
 * Test class for Class Calculator
 * 
 * @author Sandra Seehars
 * @version 19.12.2019
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator testee; 
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10,  25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(25,  10) == 15);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(-10,  -25) == -35);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(-25,  -10) == -15);
	}
}
