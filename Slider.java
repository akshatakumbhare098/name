package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
         WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step -3 
		 
		 driver.get("https://jqueryui.com/slider/");
		 
		 //identifying frame
		 
      WebElement frame3  = driver.findElement(By.xpath("//*[@class='demo-frame']"));
     
      
      
      //switching to frame
      
      driver.switchTo().frame(frame3);
      
     WebElement slider2= driver.findElement(By.id("slider"));
		 
     
     //step action class & object creation
     
     Actions as=new Actions(driver);
     
    System.out.println(" slider2.getLocation()");
     
     //perform slider operation
     
     as.clickAndHold(slider2).moveByOffset(150, 0).perform();
     
     
			
	}

}
