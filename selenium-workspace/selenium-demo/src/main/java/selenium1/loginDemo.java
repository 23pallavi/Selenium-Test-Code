package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCases.HomePageClick;
import TestCases.UserDetails;

public class loginDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		UserDetails d = new UserDetails();
		HomePageClick h=new HomePageClick();
		d.enterDetails();
		h.clickLandingPage();
		//d.enterDetails();

	}

}
