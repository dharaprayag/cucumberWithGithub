package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public WebDriver driver;
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By login = By.xpath("//input[@value='Log In']");
	By captcha = By.id("checkbox");
	By alertMsg = By.xpath("//*[@class='alert alert-danger']");
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public int getCaptchaSize()
	{
		return driver.findElements(captcha).size();
	}
	public WebElement getCaptcha()
	{
		return driver.findElement(captcha);
	}
	public WebElement getAlertMsg()
	{
		return driver.findElement(alertMsg);
	}
		
}
