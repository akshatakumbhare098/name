package akshata12;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			  WebDriverManager.chromedriver().setup();
				
		       WebDriver driver= new ChromeDriver();
				 
				 //step-2
				 
			 driver.manage().window().maximize();
			 
			 //step -3 
			 
			 driver.get("https://jquryui.com/resources/demos/datepicker/other-months.html");
			 
		 Thread.sleep(4000);
		 
		 )

	}

}
