package mylibrary;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	private LibraryClass login;
	boolean lio=false;
	private String user,pass,s;
	
	public LoginTest(LibraryClass login) {
		this.login=login;
	}
	
	@Given("He enter a valid username {string} and valid password {string}")
	public void he_enter_a_valid_username_and_valid_password(String username, String password) {
	    user=username;
	    pass=password;
	}

	@When("He call login funcion")
	public void he_call_login_funcion() {
	    s=login.loginFunction(user,pass,lio);
	}

	@Then("Administrator with username {string} and password {string} login")
	public void administrator_with_username_and_password_login(String username, String password) {
		String expected=s;
		String actual=password;
		assertTrue(expected==actual);
		
	}

	@Given("He enter a valid username {string} but a wrong password {string}")
	public void he_enter_a_valid_username_but_a_wrong_password(String username, String password) {
		user=username;
	    pass=password;
	}

	@Then("A message wrong should appear")
	public void a_message_wrong_should_appear() {
		JOptionPane.showMessageDialog(null, "You enter a wrong password");
	}
	public boolean getLio() {
		return lio;
	}

	public void setLio(boolean lio2) {
		this.lio=lio2;
	}
}
