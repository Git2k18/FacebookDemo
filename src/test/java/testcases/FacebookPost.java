package testcases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;

public class FacebookPost {
	
	public class FacebookPostTest extends BaseSetup{
	    String userName = readconfig.getUsername();
	    String password = readconfig.getPassword(); 
	    
	    LoginPage objLogin;
	    HomePage objHome;
	 
	    @Test
	    public void FacebookPost() throws Throwable{
	        driver.get(baseUrl);
	        objLogin = new LoginPage(driver);
	        objHome = new HomePage(driver);
	        objLogin.login(userName, password);
	        objHome.postStatus("Hello World");
	    }

	}
}
