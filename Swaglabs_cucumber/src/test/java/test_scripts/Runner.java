package test_scripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@CucumberOptions(
		features = ".//src//test//resources//features" , 
		glue = "test_scripts"
		
		
		)
@RunWith(Cucumber.class)
public class Runner {
	
	

}
