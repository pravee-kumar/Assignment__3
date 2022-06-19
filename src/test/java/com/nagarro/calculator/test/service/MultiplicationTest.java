package com.nagarro.calculator.test.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.nagarro.calculator.service.mulService;


public class MultiplicationTest {

	@Test
	public void testAdditionOfNumbers() {
		mulService ml= new mulService();
		int a=6;
		int b=7;
		int r= ml.mul(a,b);
		assertEquals(42,r);
	}
	@Test
	public void testAddOfNumbers() {
		mulService ml= new mulService();
		int a=6;
		int b=7;
		int r= ml.mul(a,b);
		assertEquals(42,r);
	}
}
