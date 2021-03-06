package mylibrary;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutTest {

	LibraryClass logout;
	LoginTest lt;
	
	public LogoutTest(LibraryClass logout) {
		this.logout=logout;
	}
	
	@Given("The administrator loged in")
	public void the_administrator_loged_in() {
		lt.setLio(true);
	}

	@When("He call logout function")
	public void he_call_logout_function() {
		logout.logoutFunction(false);
	}

	@Then("Administrator log out")
	public void administrator_log_out() {
	    JOptionPane.showMessageDialog(null, "You logout");
	}
}
