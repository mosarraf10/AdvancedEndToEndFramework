package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	
	public WebDriver driver;
	String expectedURL = "https://www.amazon.com/";
	
	@BeforeClass
	public void beforeClass() {
		String Comdir = System.getProperty("user.dir");
		String ChromeDir = Comdir + "/browsers/chromedriver";
		System.setProperty("webdriver.chrome.driver", ChromeDir);
		driver = new ChromeDriver();
		
			
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(expectedURL);
		String currectURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, currectURL);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test case is done!");
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		
	}
	

}
