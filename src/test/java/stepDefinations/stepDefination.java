package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.Base;

@RunWith(Cucumber.class)
public class stepDefination extends Base {

	@Given("^Initialize the browser with chrome$")
    public void Initialize_the_browser_with_chrome() throws Throwable {
		
		driver = initilizeDriver();
        
    }
	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
	   	driver.get(strArg1);
	        
	}

	@And("^Click on Login link in home page to land on secure sigin in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sigin_in_page() throws Throwable {
		
		LandingPage l = new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		l.getLogin().click();
	       
	}

	@And("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		System.out.println(lp.getEmail().getText());
		System.out.println(lp.getPassword().getText());
		//lp.getLogin().click();
		//Thread.sleep(3000);
		//System.out.println(lp.getAlertMsg().getText());
		/// TEST EXECUTION HAS TO BE FAILED DUE TO CAPTCHA
    }
	/*@Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable
    {
    	/*portalHomePage p = new portalHomePage(driver);
    	Assert.assertTrue(p.getSearchBox().isDisplayed());    
    }*/
    @Then("^Close the Browsers$")
    public void Close_the_Browsers() throws Throwable
    {
    	driver.quit();
    }
    
    
}		
