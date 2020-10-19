package cucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

public class cucumberJava{
	
	WebDriver driver = null;
	
	@Given("^i have open the browser$")
	
	public void openBrowser() {
		driver = new ChromeDriver();
		
	}
	
	@When ("^i open Facebook Website$")
	
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@Then ("^Login button should be exist$")
	
	public void loginButton() {
		
		if(driver.findElement(By.id("email")).isEnabled()) {
			System.out.println("Test 1 pass");
			
		} else {
			System.out.println("Test 1 is fail");
		}
		
		driver.close();
	}
	
 
	
	
}

