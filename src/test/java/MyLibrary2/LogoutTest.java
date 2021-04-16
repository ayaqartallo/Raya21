package MyLibrary2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogoutTest {
	
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
		
	}

}
