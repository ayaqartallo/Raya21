package mylibrary;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mylibrary.LibraryClass2;

public class AddBookSteps {
	private String e;
	private LibraryClass2 b;
	private static final Logger log = Logger.getLogger(LibraryClass2.class.getName());
	
	public AddBookSteps(LibraryClass2 b) {
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
	    assertEquals(actual,expected);
	}

	@Given("Administrator doesn't logged in")
	public void administrator_doesn_t_logged_in() {
	   b.setLoggedin(false);
	}

	@Then("A message login to add books should be appear")
	public void a_message_login_to_add_books_should_appear() {
		log.info("You should login to add book to the library!");
	}

}
