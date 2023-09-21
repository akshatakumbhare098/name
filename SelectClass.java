package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 
		 //Step - 1 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //Step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step -3 
		 
		 driver.get("https://vctcpune.com/selenium/practice.html#");
		 
		 Thread.sleep(4000);
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollB(0,1000)");
		 
		 
		 
		 //handling Dropdown
		 
		 //a) locate the web- Element 
		 
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		
		//b) Create the object of Select class
		
		Select sel=new Select(dropdown);
		
		//c) select the require value
		
	     //   sel.selectByIndex(1);
		
          sel.selectByVisibleText("Option2");
		
               // sel.selectByValue("option1");
		
		Thread.sleep(300);
		
		driver.close();
		
		
	
		
	
		
		
				
				
		 
	}

}
