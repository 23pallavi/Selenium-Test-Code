/**
 * 
 */
package TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author Pallavi
 *
 */
public class ExplicitWaitExample {
	@Test
	public void implicitWait()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebDriverWait wait = new WebDriverWait(driver,10);
		long t1= System.currentTimeMillis();
		try
		{
			driver.manage().timeouts().implicitlyWait(t1, null);
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//button[@id='mousehover']")));
		}
		catch(Exception e)
		{
			System.out.println("Element not found");
		}
		//long t2 = System.currentTimeMillis();
		// Assert.assertEquals(expected, actual);
		
	}

}
