package akshata12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3
		 
		 driver.get("https://www.snapdeal.com");
		 driver.get("http://www.amazon.com");
		 
		 driver.navigate().back(); // snapdeal page
		 
		// driver.navigate().forward();//amazon application
		 
		// driver.navigate().refresh(); // refresh / reload the page;
	}
}
