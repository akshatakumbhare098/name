package akshatapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
	public void testMethod() 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//open url
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("verifying title");
		
		
	}

}
