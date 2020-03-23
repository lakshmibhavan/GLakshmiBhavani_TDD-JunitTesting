package Epam;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringTest {
	StringM m;
	@Before
	public void init()
	{
		m = new StringM();
	}
	@Test
	public void test() {
		assertEquals("BCD",m.Epam1("ABCD"));
	}
	@Test
	public void test1() {
		assertEquals("CD",m.Epam1("AACD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD",m.Epam1("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("BBAA",m.Epam1("BBAA"));
	}
	@Test
	public void test4() {
		assertEquals("BAA",m.Epam1("AABAA"));
	}

}


	
