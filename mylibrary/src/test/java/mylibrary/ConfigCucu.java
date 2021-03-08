package mylibrary;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="RSegression",plugin="html: outputTesting/cucuOut.html",features="use_cases_features",glue="mylibrary")
public class ConfigCucu {
	
	
	

}
