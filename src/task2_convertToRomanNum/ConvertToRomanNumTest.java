package task2_convertToRomanNum;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertToRomanNumTest {

	@Test
	public void test() {
		convertToRomanNumerical Convert = new convertToRomanNumerical();;
		assertEquals("変換できませんでした", Convert.convert(0));
		assertEquals("I",   Convert.convert(1));
		assertEquals("III", Convert.convert(3));
		assertEquals("IV",  Convert.convert(4));
		assertEquals("V",   Convert.convert(5));
		assertEquals("VI",  Convert.convert(6));
		assertEquals("VIII",Convert.convert(8));
		assertEquals("IX",  Convert.convert(9));
		assertEquals("X",   Convert.convert(10));
		assertEquals("XI",  Convert.convert(11));
		assertEquals("XX",  Convert.convert(20));
		assertEquals("変換できませんでした", Convert.convert(21));
	}

}
