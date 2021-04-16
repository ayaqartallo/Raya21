package MyLibrary2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTest {

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
		lc.setLoggedin(true);
		String expected="added";
		String actual=lc.addBook("Inferno", "Dan Brown", "Brown2013", "6140108993");
		assertEquals(expected,actual);
		
	}
	@Test
	public void test2() {
		lc.setLoggedin(true);
		String expected="not added";
		String actual=lc.addBook("The Foot Book", "Dr Seuss", "Seuss1996", "0679882804");
		assertNotEquals(expected,actual);
		
	}


}
