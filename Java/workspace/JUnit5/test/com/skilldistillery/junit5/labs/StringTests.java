package com.skilldistillery.junit5.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests strings and their methods")
class StringTests {

	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	@DisplayName("Tests that a substring from 1-5 will return the correct characters")
	void testSub1To5() {
		String testString = "abcdefg";
		String a = testString.substring(1, 5);
		assertEquals("bcde", a);
	}
	
	@Test
	@DisplayName("Tests that begin/end index are exclusive")
	void testSub0to7() {
		String testString = "abcdefg";
		String a = testString.substring(0, 7);
		assertEquals("abcdefg", a);
	}
	
	@Test
	@DisplayName("Tests that an index that's too high throws an OutOfBounds Exception")
	void indexOutOfBounds() {
		String testString = "abcdefg";
		Exception e = assertThrows(Exception.class,
				() -> testString.substring(0, 8));
		assertEquals("String index out of range: 8", e.getMessage());
	}
	
	@Test
	@DisplayName("Tests that negative index throws an OutOfBounds Exception")
	void indexOutOfBoundsNegative() {
		String testString = "abcdefg";
		Exception e = assertThrows(Exception.class,
				() -> testString.substring(-1, 7));
				assertEquals("String index out of range: -1", e.getMessage());
	}
	
	@Test
	@DisplayName("Tests that begin index larger than end index throws an OutOfBounds Exception")
	void indexOutOfBoundsBeginAtEnd() {
		String testString = "abcdefg";
		Exception e = assertThrows(Exception.class,
				() -> testString.substring(7, 5));
		assertEquals("String index out of range: -2", e.getMessage());
	}
	
	@Test
	@DisplayName("Tests that OutOfBounds Exception is specific to Strings")
	void stringIndexOutOfBounds() {
		String testString = "abcdefg";
		Exception e = assertThrows(Exception.class,
				() -> testString.substring(6, 5));
		assertEquals("StringIndexOutOfBoundsException", e.getClass().getSimpleName());
	}

}
