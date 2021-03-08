package mylibrary;

import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookTest {
	
	private boolean e;
	private LibraryClass b;
	
	@Given("Administrator loged in")
	public void administrator_logged_in() {
	   b.setLio(true); 
	}

	@When("He fill the book's {string} and {string} and {string} and {string}")
	public void he_fill_the_book_s_and_and_and(String title, String auther, String signature, String isbn) {
		 e=b.addBook(title,auther,signature,isbn);
	}

	@Then("Add the book in the library")
	public void add_the_book_in_the_library() {
	    boolean expected=true;
	    boolean actual=e;
	    assertTrue(expected==actual);
	}

	@Given("Administrator doesn't loged in")
	public void administrator_doesn_t_logged_in() {
	   b.setLio(false);
	}

	@Then("A message login to add books should be appear")
	public void a_message_login_to_add_books_should_appear() {
	    JOptionPane.showMessageDialog(null, "You should login to add book to the library!");
	}
}
