package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = {"runner"} ,
				 dryRun=false , monochrome=true)
				
					
public class runnerClass {

	
}
