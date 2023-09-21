package akshata12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
WebDriverManager.chromedriver().setup();
		
		
		//step 1 : launch broswer
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://vctcpune.com/selenium/practice.html#");
		
		 
          String windowID= driver.getWindowHandle();//return id
    
          
          System.out.println(windowID);
          
          
          driver.findElement(By.id("opentab")).click();
		 
          
        Set<String> windowIDs = driver.getWindowHandles();
        
        //first method - Iterator()
        
        Iterator<String> it=windowIDs.iterator();
        
        String parentwindowID=it.next();
        String ChildwindowID=it.next();
        
        System.out.println("Parent window ID:"+parentwindowID);
        System.out.println("Child window ID:"+ChildwindowID);
        
        //how to use windows ID's for switching
        
        driver.switchTo().window(parentwindowID);
        
        
        System.out.println("Parent window title:"+ driver.getTitle());
        
        
        
            driver.switchTo().window(ChildwindowID);
        
        
        System.out.println("Child window title:"+ driver.getTitle());
        
        driver.close();
        
        
        
        
        
          
          
		
	}

}
