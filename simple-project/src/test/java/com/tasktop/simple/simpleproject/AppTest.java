package com.tasktop.simple.simpleproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest
{
	@Test
	public void nameIsExpected() {
		String name = new App().getName();
		assertEquals("Brandon", name);
	}
	
	public AppTest() {
		
	}
}
