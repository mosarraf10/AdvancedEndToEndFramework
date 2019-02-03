package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class UserAbleToValidateUserNameInputField extends BaseTest{
	
	
	
	@Test
	public void userAbleToValidateUserNameInputField() throws InterruptedException {
		
		
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	
		if(searchBox.isEnabled() && searchBox.isDisplayed()) {
			searchBox.clear();
			searchBox.sendKeys("iPhone");
		}else {
			System.out.println("InputFiled is disable!");
		}
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
		submit.submit();

		Thread.sleep(3000);
	
	}
	
}
