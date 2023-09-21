package akshata12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://www.amazon.in/");
		 
		List<WebElement> links = driver.findElement(By.tagName("a"));
		
		System.out.println("number of links present:" +links.Size());
	}

}
