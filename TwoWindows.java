package akshata12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web p
		 
		 driver.get("https://www.snapdeal.com/");
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 //open webpage
		 
		 driver.get("https://www.amazon.in/");
		 
		 

	}

}
