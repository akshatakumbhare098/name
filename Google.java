package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		//step -3
		 
		 driver.get("https://www.google.com/");
		 
		// driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("tajmahal");
		 
		 WebElement button=driver.findElement(By.xpath("input[@class=\"gNO89b\"]"));
		 
		 button.click();
		 		
	}

}
