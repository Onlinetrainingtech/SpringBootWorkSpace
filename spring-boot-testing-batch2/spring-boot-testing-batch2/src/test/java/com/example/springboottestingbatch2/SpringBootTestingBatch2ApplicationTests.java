package com.example.springboottestingbatch2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestingBatch2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindSqureroot()
	{
		Arithmetic instance=new Arithmetic();
		double expResult=2.5;
		double result=instance.findSquareroot(6.25);
		assertEquals(expResult,result,0.0);
	}
}
