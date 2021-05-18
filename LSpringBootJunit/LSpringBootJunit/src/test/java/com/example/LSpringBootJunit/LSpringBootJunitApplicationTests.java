package com.example.LSpringBootJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LSpringBootJunitApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Test
	public void testFindSquareroot()
	{
		Arithmetic obj=new Arithmetic();
		double expResult=1;
		double result=obj.findSquareroot(6.25);
		assertEquals(expResult,result,0.0);
	}
	
}
