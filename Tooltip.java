package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1 : launch broswer
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://jqueryui.com/tooltip/");
		 
		 driver.switchTo().frame(0);
		 
		WebElement inputbox =driver.findElement(By.xpath("//input[@id='age']"));
		
		//how to get the value of the attribute getattribute method  
		
		String tooltipText=inputbox.getAttribute("title");
		
		System.out.println(tooltipText);
		 		

	}

}
