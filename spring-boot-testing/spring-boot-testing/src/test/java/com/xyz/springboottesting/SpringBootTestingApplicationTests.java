package com.xyz.springboottesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestingApplicationTests {

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
