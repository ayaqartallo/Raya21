package cucu;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepsTest {
	private static int am;
	private Fruit fc;
	
	//dependency injection singltone object
	public CheckoutStepsTest(Fruit fc) {
		this.fc = fc;
	}

	@Given("I should have {int} NIS")
	public void i_should_have_nis(Integer amountOfMoney) {
	   am=amountOfMoney;
	}

	@When("I checkout for buying an one apple")
	public void i_checkout_for_buying_an_one_apple() {
	    fc.checkout();
	    am=49;
	}

	@Then("The amount of money should be {int}")
	public void the_amount_of_money_should_be(Integer remainingMoney) {
	    assertTrue(am==remainingMoney);
	}
	
	@Then("Error should be appeared")
	public void error_should_be_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
