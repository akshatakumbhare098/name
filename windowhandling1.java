package akshata12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3 open webpage
		 
		 driver.get("https:opensource-demo.orangehrmlive.com/");
		 
		String windowID =driver.getWindowHandle();
		System.out.println(windowID);
	}

}
