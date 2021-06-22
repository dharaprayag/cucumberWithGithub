package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class portalHomePage 
{
	
	public WebDriver driver;
	
	By searchBox = By.name("query");
	
	public portalHomePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
		
}
