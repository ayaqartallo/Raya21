package mylibrary;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	private LibraryClass login;
	private String user,pass,s;
	
	public LoginTest(LibraryClass login) {
		this.login=login;
	}
	
	@Given("Administrator enter a valid username {string}")
	public void administrator_enter_a_valid_username(String username) {
		user=username;
	}
	
	@Given("He enter a valid password {string}")
	public void he_enter_a_valid_password(String password) {
	    pass=password;
	}

	@When("He call login funcion")
	public void he_call_login_funcion() {
	    s=login.loginFunction(user,pass);
	}

	@Then("Administrator with valid password {string} logged in")
	public void administrator_with_valid_password_logged_in(String password) {
		String expected=s;
		String actual="found";
		assertTrue(expected==actual);
	}
	
	@Given("He enter a unvalid password {string}")
	public void he_enter_a_unvalid_password(String password) {
		pass=password;
	}

	@Then("A message wrong should appear")
	public void a_message_wrong_should_appear() {
		JOptionPane.showMessageDialog(null, "You enter a wrong password");
	}
}
