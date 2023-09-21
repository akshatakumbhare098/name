package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsenabledIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		
		//step 1 : launch broswer
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://www.facebook.com/");
		 
		 
		 driver.findElement(By.id("email")).sendKeys("akshatakumbhare");
		 
		 System.out.println("Displayed status:" searchstore.IsDisplayed());
		 
		 
		
		 

	}

}
