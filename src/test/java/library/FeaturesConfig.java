package library;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="html: outputtesting/testOut.html",features="use-cases-features",glue="library")
public class FeaturesConfig {

}