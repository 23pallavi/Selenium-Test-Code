package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By button = By.xpath("//button[@class='btn btn-primary btn-rounded waves-effect waves-light']");
	By firstname = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By email = By.xpath("//input[@id='email']");
	By phone = By.xpath("//input[@id='phone']");
	By companyname = By.xpath("//input[@id='companyName']"); 
	By submitButton = By.xpath("//div[@class='pt-4']");
	
	public WebElement click1()
	{
		System.out.println("first page");
		return driver.findElement(button);
		
	}
	
	public WebElement enterFirstName()
	{
		return driver.findElement(firstname);
		 //WebElement firstname1 = driver.findElement(firstname);
	}
	public WebElement enterLastName()
	{
		return driver.findElement(lastname);
	}
	public WebElement emailId()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement phone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement companyname()
	{
		return driver.findElement(companyname);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submitButton);
	}
	
}
	