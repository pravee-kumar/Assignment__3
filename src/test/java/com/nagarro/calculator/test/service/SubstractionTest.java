package com.nagarro.calculator.test.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.nagarro.calculator.service.subService;

public class SubstractionTest {
	@Test
	public void testSubstactionOfNumbers() {
		subService sb= new subService();
		int a=6;
		int b=7;
		int r= sb.sub(a,b);
		assertEquals(-1,r);
	}
	@Test
	public void testSubOfNumbers() {
		subService sb= new subService();
		int a=6;
		int b=7;
		int r= sb.sub(a,b);
		assertEquals(1,r);
	}
}
