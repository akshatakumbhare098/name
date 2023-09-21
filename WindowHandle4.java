package akshata12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step - 3 open webpage
		 
		 driver.get("http://omayo.blogspot.com/");
		 
		String windowID =driver.getWindowHandle();
		
		System.out.println(windowID);
		
		 driver.findElement(By.linkText("Open a popup window")).click();

		 Set<String> windowsIDs =driver.getWindowHandles();
		 
		 Iterator<String> it =windowsIDs.iterator();
		 
		String ParentwindowID =it.next();
		String ChildwindowID =it.next();
		
		System.out.println(ParentwindowID);
		System.out.println(ChildwindowID);
		
		driver.switchTo().window(ParentwindowID);
		
		System.out.println("Parentwindowtitle:"  + driver.getTitle());
		
		driver.switchTo().window(ChildwindowID);
		
		System.out.println("Childwindowtitle:" + driver.getTitle());
		 
		driver.switchTo().window(ParentwindowID);
		
		//driver.close();
		
		//driver.quit();
	}
	

}
