package testRunner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

public class Runner {
	
	@RunWith(cucumber.class)
	@cucumber Options(
		
	feature = "C:\\Users\\HP\\eclipse-workspace\\Project\\src\\test\\java\\cucumberJava\\cucumberjava.feature",
	.glue{"C:\Users\HP\eclipse-workspace\Project\Amazon_Project\stepDefinitions"},            
      format{"pretty","html:test-output})
			
				
		
	}
	

}
