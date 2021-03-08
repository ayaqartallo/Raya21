package mylibrary;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutTest {

	LibraryClass lc;
	
	
	@Given("The administrator logged in")
	public void the_administrator_logged_in() {
		lc.setLoggedin();
	}

	@When("He call logout function")
	public void he_call_logout_function() {
		lc.logoutFunction();
	}

	@Then("Administrator log out")
	public void administrator_log_out() {
	    JOptionPane.showMessageDialog(null, "You are logout");
	}
}
