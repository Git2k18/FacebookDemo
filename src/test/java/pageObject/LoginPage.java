package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.ReadConfig;

public class LoginPage {
	ReadConfig config = new ReadConfig();

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(id = "pass")
    WebElement passwordField;
 
    @FindBy(name = "login") 
    WebElement login;
    
    public void setUserName(String uname)
	{
    	emailField.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
	}
	
	
	 public void login(String username, String password) 
	 {
        emailField.sendKeys(username);
        
        passwordField.sendKeys(password);
       
        login.click();
    }
}
