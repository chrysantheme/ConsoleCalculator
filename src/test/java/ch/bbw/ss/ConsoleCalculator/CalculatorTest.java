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
}
