package myinstagram;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import myinstagram.util.Calc;

public class TextCalc {
	Calc c;
	@Test
	public void add_twoPositiveIntegersTest() {
		c=new Calc();
		int expected=8;
		int actual=c.add(5, 3);
		assertTrue(expected==actual);
		
	}

}
