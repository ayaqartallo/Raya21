package MyLibrary2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="html: outputtesting/testOut.html",features="use-cases-features",glue="MyLibrary2")
public class FeaturesConfig {

}