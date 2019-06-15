package com.raj.junit;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class RemovingATest {
	/*
	 * remove A if it is present in first 2 chars
	 * 
	 */

	@Test
	void firstTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("ABCD");
		assertEquals("BCD",actual);
	
			}
	@Test
	void secondTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("AACD");
		assertEquals("CD",actual);
	
			}
	@Test
	void thirdTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("BACD");
		assertEquals("BCD",actual);
	
			}
	@Test
	void forthTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("BBAA");
		assertEquals("BBAA",actual);
	
			}
	@Test
	void fifthTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("AABAA");
		assertEquals("BAA",actual);
	
			}
	@Test
	void sixthTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("");
		assertEquals("",actual);
	
			}
	@Test
	void seventhTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("A");
		assertEquals("",actual);
	
			}
	@Test
	void eightTest() {
		RemovingA rem = new RemovingA();
		String actual=rem.eliminate("B");
		assertEquals("B",actual);
	
			}
}
