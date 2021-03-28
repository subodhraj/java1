package com.cox.sample;

import org.junit.Test;

public class sampleutiltest {
	@Test
	public void testAdd( ) {
		System.out.println("add");
		Integer a = 15;
		Integer b = 15;
		Integer expResult = 30;
		Integer result = sampleutil.add(a, b);
		assertEquals(expResult, result);
		assertEquals(null,sampleutil.add(15, null));
		assertEquals(null,sampleutil.add(null, 15));
		assertEquals(null,sampleutil.add(null, null));
	}

}
