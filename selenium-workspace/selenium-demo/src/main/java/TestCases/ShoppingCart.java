package TestCases;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoppingCart {
	@Test
	public void mouseover() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] names = {"Cucumber","Brocolli"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{ 
			
		//to get text of product present at that index
			String name = products.get(i).getText();
			//convert array to array list for easy search
			List nameList = Arrays.asList(names);
			if(nameList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				System.out.println("here");
				break;
				
			}	
				}
		 driver.quit();
			}
			
		}
	

