package akshata12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3 open webpage
		 
		 driver.get("http://omayo.blogspot.com/");
		 
		 driver.findElement(By.linkText("Open a popup window")).click();
		 
		 Thread.sleep(3000);
		 
		 Set<String> windows=driver.getWindowHandles();
		 
		 Iterator<String> itr=windows.iterator();
		 
		 while(itr.hasNext())
		 {
			 String window=itr.next();
			 
			 driver.switchTo().window(window);
			 
			 if(driver.getTitle().equals("Basic web Page Title")) {
				 
				 driver.close();
			 }
			 
			 
		 }
		 
		

	}

	private static Iterator<String> next() {
		// TODO Auto-generated method stub
		return null;
	}

}
