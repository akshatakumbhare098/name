package akshata12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//02-May-2022;
		
		String expectedDay="2";
		
		String expectedMonth="May";
		
		String expectedYear="2022";
		
		
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step -3 
		 
		 driver.get("https://jqueryui.com/datepicker/");
		 
		 //first aapan click krun nantr nanter ji date aahe calender mdhe ti date comapare karu expected sobat same nsel tr next arrow button aahe n 
		 
		 //tithe click karu month aani year expected sobt match hot aahe ki nahi te check karu equal nhi aahe tr next var click karn ...month jo aahe to equal aahe ki nhi aahe te check karu.  same aala tr apan date var click karun date select karun gheu
		 
		// tyachyasathi script write karayachi aahe
		 
		 driver.switchTo().frame(0);
		 
		 WebElement datepicker=driver.findElement(By.id("datepicker"));
		 
		 datepicker.click();
		 
		 //1st use the while loop
		 //loop chya aat mdhe month la find kaun 
		 
		 while(true)
		 {
			 String calenderMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calenderMonth.equals(expectedMonth)&&calenderYear.equals(expectedYear))
			{
				List<WebElement> daysList =driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList)
				{
					
					String calenderDay=e.getText();
					if(calenderDay.equals(expectedDay))
				{https://jqueryui.com/datepicker/
					e.click();
					break;
				}
			}
				break;
		 }
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle']")).click();
			}
	}
	}
	
}
