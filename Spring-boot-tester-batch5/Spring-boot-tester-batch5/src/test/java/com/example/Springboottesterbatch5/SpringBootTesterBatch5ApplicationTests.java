package com.example.Springboottesterbatch5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTesterBatch5ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testFindSquarroot()
	{
		Arithmetic instance=new Arithmetic();
		double expResult=2.5;
		double result=instance.findSquarroot(6.25);
		assertEquals(expResult,result,0.0);
	}

}
