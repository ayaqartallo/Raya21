package practice2021;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTest {
	private String e;
	private LibraryClass b;
	
	public AddTest(LibraryClass b) {
		this.b=b;
	}
	
	@Given("Administrator logged in")
	public void administrator_logged_in() {
	   b.setLoggedin(true);
	}

	@When("He fill the book's {string} and {string} and {string} and {string}")
	public void he_fill_the_book_s_and_and_and(String title, String auther, String signature, String isbn) {
		 e=b.addBook(title,auther,signature,isbn);
	}

	@Then("Add the book in the library")
	public void add_the_book_in_the_library() {
	    String expected="added";
	    String actual=e;
	    assertEquals(expected,actual);
	}

}
