package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserDetails {

	
	
	@Test
	public void enterDetails() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/personalDetails");
		LandingPage lp=new LandingPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		lp.enterFirstName().sendKeys("firstname");
		Thread.sleep(1000);
		lp.enterLastName().sendKeys("lastname");
		Thread.sleep(1000);
		lp.emailId().sendKeys("email");
		lp.phone().sendKeys("9898098232");
		lp.companyname().sendKeys("SDLC");
		lp.submit().click();
		driver.quit();
		//.sendKeys("phone");
		//companyname.sendKeys("companyname");
	}
	

}


