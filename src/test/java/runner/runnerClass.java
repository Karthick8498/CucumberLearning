package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = {"runner" , "hooks"} ,
				 dryRun=false , monochrome=true , tags= {"@Hooks"})
				
					
public class runnerClass {

	
}
