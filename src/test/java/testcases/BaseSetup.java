package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilites.ReadConfig;



public class BaseSetup {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseUrl = readconfig.getApplicationUrl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	
	 
	    WebDriverWait wait;
	 
	    @BeforeClass
	    public void setup(){
	        ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--disable-notifications");
	        System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
	        driver = new ChromeDriver(ops);
	        wait = new WebDriverWait(driver,50000);
	    }
	 
	    //@AfterClass
	   // public void teardown(){
	     //  driver.close();
	    }
	

