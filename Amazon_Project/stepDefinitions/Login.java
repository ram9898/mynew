package stepDefinitions;

import org.junit.Assert;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {
	
	WebDriver driver = null;
	
	
	@Given ("^ i open the browser$")
	
	
	public void  openBrowser(){
		
		driver = new ChromeDriver();
		
	}
	
	@Then ("^launch the amazon website")
	
	public void launchAmazon() {
		driver.navigate().to("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dprime%2Bamazon%26i%3Dlawngarden%26adgrpid%3D74711214680%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIobb89-uh6wIVCGoqCh3aPQwBEAAYASAAEgL6W_D_BwE%26hvadid%3D356255719891%26hvdev%3Dc%26hvlocphy%3D1007809%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D17901403658381576861%26hvtargid%3Dkwd-298741532854%26hydadcr%3D15433_1931143%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&switch_account=");
		
	}
	
	@And ("^I enter username$")
	
	public void userName() {
		
		driver.findElement(By.id("ap_email"));
		driver.findElement(By.id("continue"));
	}
	
	@And("^I enter password$")
	
	public void password() {
		driver.findElement(By.id("ap_password"));
		
	}
	
	@And("^Click on login button$")
	
	public void loginButton() {
		
		driver.findElement(By.id("signInSubmit"));
		
	}
	
	@Then ("^I make sure page is navigating to Amazon website$")
	
	public void verifySite() {
		
		String ActualTitle = driver.getTitle();
		System.out.println("Home page title: " +ActualTitle);
		
		Assert.("Amazon.in:prime amazon", ActualTitle);
	}

}
