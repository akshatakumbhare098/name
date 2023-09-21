package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglepageAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3 open webpage
		 
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("tajmahal");
		 
		
		 
	    driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).click();
		 ;
	}

}
