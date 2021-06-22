package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Resources.Base;

@RunWith(Cucumber.class)
public class stepDefination extends Base {

	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		
		driver = initilizeDriver();
        
    }
	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
	   	driver.get(strArg1);
	        
	}

	@And("^Click on Login link in home page to land on secure sigin in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sigin_in_page() throws Throwable {
	       
	}

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
    }

   

}