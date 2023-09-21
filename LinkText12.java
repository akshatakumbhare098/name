package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome.0.69i59j69i60l2j69i61.2320j0j15&sourceid=chrome&ie=UTF-8");
		 
		// driver.findElement(By.linkText("data-ae="1"data-al="1"data-ved="2ahUKEwiW5oCe3PD8AhW43jgGHQt3BFoQ0Qx6BAgHEAE")");
		 //open web page
	
		// driver.get("https://www.facebook.com/");
		 
		// driver.findElement(By.linkText("Forgotten password?")).click();
		 
		//driver.findElement(By.partialLinkText("password?")).click();
		 
		 //driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome.0.69i59j69i60l2j69i61.2116j0j15&sourceid=chrome&ie=UTF-8");
		 
		// driver.findElement(By.partialLinkText("data-ae=\"1\"")).click();
		 
		// driver.get("https://www.google.com/search?q=instagram&oq=instagram&aqs=chrome..69i57.4616j0j15&sourceid=chrome&ie=UTF-8");
		 
		// driver.findElement(By.linkText("Sign Up for Instagram - Share Everyday Moments")).click();
		 
		 //driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome.0.69i59j69i60l2j69i61.2320j0j15&sourceid=chrome&ie=UTF-8");
		
		// driver.findElement(By.partialLinkText("Shop Online at Amazon India - India's largest online store")).click();
		 
		// driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome.0.69i59j69i60l2j69i61.2320j0j15&sourceid=chrome&ie=UTF-8"));
	}

}
