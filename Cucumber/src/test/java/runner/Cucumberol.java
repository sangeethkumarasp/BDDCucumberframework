package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/featurefile"},
		glue= {"Stepdefs","hooks"},
		
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"},
		dryRun = false,
	    monochrome = true
	    
	
		)

public class Cucumberol {
	
	

}
