package com.devops.ci.Te;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.devops.ci.Calc.Calculator;

public class CalculatorTest 
{
	@Test
	void testAdd()
	{
		Calculator c=new Calculator();
		assertEquals(10,c.add(4,6));
		
	}
	@Test
	void testMultiply()
	{
		Calculator c=new Calculator();
		assertEquals(20,c.multiply(4, 5));
	}

}
