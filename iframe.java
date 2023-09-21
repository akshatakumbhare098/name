package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//launch chrome browser
		
		 WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step 3 
		 
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 
		 
		 //step 4 //three frame present in the web page //switch to 1st frame
		 
		 driver.switchTo().frame(0);//by index use kelay
		 
		 //step 5 //locating web element
		 
		 driver.findElement(By.linkText("org.openqa.selenium")).click();
	}

}
