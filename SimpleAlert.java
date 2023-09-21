package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		
		//step 1 : launch broswer
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://vctcpune.com/selenium/practice.html#");
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,700)");
		 
		 //locating the web element
		 
	  driver.findElement(By.id("alertbtn")).click();
	  
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(4000);
	}

}
