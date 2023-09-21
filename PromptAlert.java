package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		 
		 driver.findElement(By.id("promtButton")).click();
		 
		 driver.switchTo().alert().sendKeys("Hi");
		 
		 driver.switchTo().alert().accept();
		 
		

	}

}
