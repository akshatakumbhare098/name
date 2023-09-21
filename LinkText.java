package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		//step -3
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 
		// driver.switchTo().newWindow(WindowType.TAB);

}
}
