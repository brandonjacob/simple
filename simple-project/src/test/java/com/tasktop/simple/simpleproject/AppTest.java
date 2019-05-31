package com.tasktop.simple.simpleproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest
{
	// Some comments for my test
	@Test
	public void nameIsExpected() {
		String name = new App().getName();
		assertEquals("Brandon", name);
	}
	
	public AppTest() {
		
	}
}
