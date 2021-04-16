package MyLibrary2;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import MyLibrary2.LibraryClass2;

public class LoginStepsTest {
	private LibraryClass2 login;
	private  String user;
	private Object status; 
	private String pw; 
	private static final Logger log = Logger.getLogger(LibraryClass2.class.getName());
	
	public LoginStepsTest(LibraryClass2 login) {
		this.login=login;
	}
	
	@Given("Administrator enter a valid username {string}")
	public void administrator_enter_a_valid_username(String username) {
		user=username;
	}
	
	@Given("He enter a valid password {string}")
	public void he_enter_a_valid_password(String password) {
	   pw=password;

	}

	@When("He call login funcion")
	public void he_call_login_funcion() {

	    status=login.loginFunction(user,pw);	

	}
	@Then("Administrator with valid password logged in and the status should be {string}")
	public void administrator_with_valid_password_logged_in_and_the_status_should_be(String status) {
		assertEquals(this.status,status);

	}
	@Given("He enter a unvalid password {string}")
	public void he_enter_a_unvalid_password(String password) {
		pw=password;
	}
	@Then("A message wrong should appear")
	public void a_message_wrong_should_appear() {
		log.info("You enter a wrong password");
	}
	
	

}
