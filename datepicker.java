package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		//02-May - 2022
		
		String expectedDay ="2";
		String expectedMonth="May";
		String expectedYesr="2022";
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step 3 
		 
		 driver.get("https://jqueryui.com/datepicker/");
		 
		 //switch to iframe
		 
		 driver.switchTo().frame(0);
		 
		 //locating the web element
		 
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		 
		datepicker.click();
		
		Thread.sleep(4000);
		 
	}

}
