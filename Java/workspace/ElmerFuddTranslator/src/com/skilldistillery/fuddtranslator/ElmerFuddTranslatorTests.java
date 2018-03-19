package com.skilldistillery.fuddtranslator;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElmerFuddTranslatorTests {
	
	public ElmerFuddTranslator t;
	
	@Before
	public void setUp() throws Exception{
		t = new ElmerFuddTranslator();
	}
	
	@After
	public void tearDown() throws Exception{
		t = null;
	}
	
	@Test
	public void test_translateWord_with_null_input_returns_empty_String() {
		assertEquals("", t.translateWord(null));
	}
	
	@Test
	public void test_translateWord_with_word_containing_r_returns_original() {
		String input = "duck";
		String expected = "duck";
		assertEquals(expected, t.translateWord(input));
		
	}
	
	@Test
	public void test_translateWord_with_word_not_containing_r_converts_to_w() {
		String input = "rabbit";
		String expected = "wabbit";
		assertEquals(expected, t.translateWord(input));
		
	}
	@Test
	public void test_translateWord_with_word_not_containing_l_and_r_converts_to_w() {
		String input = "rascal";
		String expected = "wascaw";
		assertEquals(expected, t.translateWord(input));
		
	}
	
	
		
}
