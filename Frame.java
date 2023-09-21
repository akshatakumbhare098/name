package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
	
		
		//launch chrome browser
		
		 WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step 3 
		 
		 driver.get("https://www.rediff.com/");
		 
		 //step 4 how to switch iframe
		 
		 //3 ways to switch iframe
		 
		 //1.By id or by name
		 
		 //2.By webelement
		 
		 //3. By index
		 
		 //driver.switchTo().frame(method use) method use means 3 methods...aadhi apan frame var switch karto next 
		 
		 //switch to iframe
		 
		 driver.switchTo().frame("moneyiframe");
		 
		 //next apan webelement la access krto webelement frame chya aat mdhe aahe tya 
		 
		 //find web element & print value
		 
		 String nseindex = driver.findElement(By.id("nseindex")).getText();
		 
		 System.out.println("nseindex");)
	}
	}

}
