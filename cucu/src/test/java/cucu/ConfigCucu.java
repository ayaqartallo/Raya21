package cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="regression",plugin="html: outputTesting/cucuOut.html",features="use_cases_features",glue="cucu")
public class ConfigCucu {

}
