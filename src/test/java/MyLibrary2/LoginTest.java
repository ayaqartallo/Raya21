package MyLibrary2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

	LibraryClass2 lc;
	
	@Before
	public void setUp() throws Exception {
		lc=new LibraryClass2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String expected="found";
		String actual=lc.loginFunction("khalid", "2021k");
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		String expected="found";
		String actual=lc.loginFunction("maher", "2020m");
		assertNotEquals(expected,actual);
	}

}
