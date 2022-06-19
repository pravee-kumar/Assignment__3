package com.nagarro.calculator.test.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.nagarro.calculator.service.divService;

public class DivisionTest {
	@Test
	public void testDivisionOfNumbers() {
		divService ds= new divService();
		int a=6;
		int b=6;
		int r= ds.div(a,b);
		assertEquals(1,r);
	}
	@Test
	public void testdivOfNumbers() {
		divService ds= new divService();
		int a=6;
		int b=7;
		int r= ds.div(a,b);
		assertEquals(1,r);
	}
}
