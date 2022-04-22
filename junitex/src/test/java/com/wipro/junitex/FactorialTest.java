package com.wipro.junitex;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	Factorial factorial=null;
	@Before
	public void setUp() {
		factorial=new Factorial();
	}
	@Test
	public void factorialForPostiveNumber() {
		int res=factorial.calculateFactorial(5);
		assertEquals(120, res);
		assertEquals(40320, factorial.calculateFactorial(8));
	}
    @Test
	public void factorialForNegativeNumbers() {
		assertEquals(-1, factorial.calculateFactorial(-4));
	}
    @Test
    public void factorialForOneAndZero() {
    	assertEquals(1,factorial.calculateFactorial(0));
    	assertEquals(1,factorial.calculateFactorial(1));
    }
    @After
    public void tearDown() {
    	factorial=null;
    }
}
