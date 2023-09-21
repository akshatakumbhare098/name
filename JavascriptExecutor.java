package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
WebDriverManager.chromedriver().setup();
		
		
		//step 1 : launch broswer
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("http://uitestpractice.com/Students/Index");
		 
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 
		 //to type in a text in the text box
		 
		
		 
		 
		//click on the find button
		 WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
		js.executeScript("arguments[0].click();", element);
		 
	
		 
	}

	 
	
	

}
