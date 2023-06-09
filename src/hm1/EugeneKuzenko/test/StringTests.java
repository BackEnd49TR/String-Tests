package hm1.EugeneKuzenko.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTests {

//1 ********************* str.charAt(0) **********************	
	@Test
	void testCharAt() {
		String sunrise = "Sunrise";
		assertEquals('S', sunrise.charAt(0));
		assertEquals('r', sunrise.charAt(3));
		assertEquals('e', sunrise.charAt(6));
	}

//2 ********************* myStr1.compareTo(myStr2) **********************	
	@Test
	void testCompareTo() {
		assertEquals(0, "Sunrise".compareTo("Sunrise"));
		assertEquals(-1, "Sunris".compareTo("Sunrise"));
		assertEquals(1, "Sunrise".compareTo("Sunris"));

		assertEquals(2, "1234589".compareTo("12345"));
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));
		assertEquals(1, "123459".compareTo("12345"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}

//3 ********************* myStr1.compareToIgnoreCase(myStr2) **********************
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(2, "1234589".compareTo("12345"));
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));

		assertEquals(0, "Sunrise".compareToIgnoreCase("Sunrise"));
		assertEquals(0, "sunrise".compareToIgnoreCase("Sunrise"));
		assertEquals(0, "Sunrise".compareToIgnoreCase("sunRise"));
		assertTrue("Sunris".compareToIgnoreCase("Sunrise") < 0);
		assertFalse("Sunris".compareToIgnoreCase("Sunrise") > 0);
	}

//4 ********************* firstName.concat(lastName) **********************
	@Test
	void testConcat() {
//********		YG ****
		String hello = "Hello";
		String world = " World";
		String helloWorld = "Hello World";
		assertEquals(helloWorld, hello.concat(world));
		assertEquals("Hello World!", helloWorld.concat("!"));
//********************************		

		assertEquals("Sunrise", "Sun".concat("rise"));
		assertEquals("Sun rise", "Sun".concat(" rise"));

//****** corrected  ***************
		assertEquals("Sunrise", "".concat("Sunrise"));
		assertEquals("Sunrise", "Sunrise".concat(""));
	}

//5 ********************* "Hello".startsWith("He") **********************	
	@Test
	void testStartsWith() {
		assertTrue("Sunrise".startsWith("S"));
		assertTrue("Sunrise".startsWith("Sunrise"));
		assertFalse("Sunrise".startsWith("un"));
		assertFalse("Sunrise".startsWith("sunrise"));

//********  corrected  ******************************	
		assertTrue("Sunrise".startsWith(""));

	}

//6 ********************* "Hello".endsWith("o") **********************	
	@Test
	void testEndsWith() {
		assertTrue("Sunrise".endsWith("e"));
		assertFalse("Sunrise".endsWith("s"));
		assertFalse("Sunrise".endsWith("sunrise"));

//*********************  corrected  ******************************
		assertTrue("Sunrise".endsWith(""));
	}

//7 ********************* "Hello".contains("e") **********************
	@Test
	void testContains() {
		assertTrue("Sunrise".contains("Sunrise"));
		assertTrue("Sunrise".contains("Su"));
		assertTrue("Sunrise".contains("nri"));
		assertFalse("Sunrise".contains("uni"));
		assertFalse("Sunrise".contains("sun"));
	}

//8 ********************* "Hello".indexOf(String str) **********************
	@Test
	void testIndexOf() {
		assertEquals(0, "Sunrise".indexOf("Sun"));
		assertEquals(3, "Sunrise".indexOf("ri"));
		assertEquals(4, "Sun rise".indexOf("rise"));
		assertEquals(2, "hello".indexOf("llo"));
		assertEquals(-1, "Sun".indexOf("sun"));
		assertEquals(-1, "Sun".indexOf("rise"));
	}

//9 ********************* "Hello".lastIndexOf(String ch) **********************	
	@Test
	void testLastIndexOf() {
		assertEquals(5, "Sunrise".lastIndexOf("s"));
		assertEquals(0, "Sunrise".lastIndexOf("S"));
		assertEquals(6, "Sun rise".lastIndexOf("s"));
		assertEquals(3, "hello".lastIndexOf("l"));
		assertEquals(-1, "Sun".lastIndexOf("s"));
		assertEquals(-1, "Sun".lastIndexOf("r"));
	}
}
