package mylibrary;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mylibrary.LibraryClass2;

public class LogoutSteps {
    LibraryClass2 lc;
    private static final Logger log = Logger.getLogger(LibraryClass2.class.getName());
	
	public LogoutSteps(LibraryClass2 lc) {
		this.lc=lc;
	}
	
	@Given("The administrator logged in")
	public void the_administrator_logged_in() {
		lc.setLoggedin(true);
	}

	@When("He call logout function")
	public void he_call_logout_function() {
		lc.logoutFunction();
	}

	@Then("Administrator log out")
	public void administrator_log_out() {
	    
		log.info("You are logout");
	}

}
