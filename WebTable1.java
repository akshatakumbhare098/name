package akshata12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 driver.manage().window().maximize();
		 
		 //open web page
		 
		 driver.get("https://vctcpune.com/selenium/practice.html#");
		 
		 //find total no.of rows
		 
		 List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		 
		 System.out.println("rows:" + rowList.size());
		 
		// syso("rows:" + rowList.size());
		 
		 
		 List<WebElement> columnList =driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		 
		 System.out.println("column:" +columnList.size());
		 
		 for(int r=2; r<rowList.size();r++);
		 {
			 for(int c=1;c<columnList.size();c++);
			 {
				String Data= driver.findElement(By.xpath("//table/tbody/tr[" + 2 + "]/td[" + 1 +"]")).getText();
				
				System.out.println(Data);
			 }
		 }

	}

}
