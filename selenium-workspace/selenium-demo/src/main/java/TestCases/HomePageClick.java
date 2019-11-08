/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Pallavi
 *
 */
public class HomePageClick {
	@Test
	public void clickLandingPage() throws InterruptedException {
		// TODO Auto-generated method stub
		// Properties prop = new Properties();
		// FileInputStream fis = new
		// FileInputStream("C:\\Users\\Pallavi\\eclipse\\selenium-workspace\\selenium-demo\\src\\main\\java\\selenium1\\datadriven.properties");
		// prop.load(fis);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pallavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
		LandingPage lp = new LandingPage(driver);
		lp.click1().click();
		Thread.sleep(1000);
		// lp.enterFirstName().click();

		driver.quit();

	}

}
