package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.id("datepicker")).click();
		 
		 while(true)
		 {
			String s= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 
			 System.out.println("Current Title is:"+s);
			 
			 if(!s.equalsIgnoreCase("December 2017"));
			 {
				 driver.findElement(By.xpath("//a[@title='prev']")).click();
			 }
			 
			 else
			 {
				 break;
			 }
		 }
		 
		 

	}

}
