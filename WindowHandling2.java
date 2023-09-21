package akshata12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3 open webpage
		 
		 driver.get("https:opensource-demo.orangehrmlive.com/");
		 
		 
		 String windowID=driver.getWindowHandle();
		 
		 System.out.println(windowID);
		 
		 driver.findElement(By.xpath("//a[text()='OrangehRM, Inc']")).click();
		 
		 Set<String> windowIDs=driver.getWindowHandles();
		 
		 
		Iterator<String> it= windowIDs.iterator();
		
		String parentwindowID=it.next();
		String childwindowID=it.next();
		
		System.out.println("parentwindowID");
		System.out.println("childwindowID");
		
		
		

	}

}
