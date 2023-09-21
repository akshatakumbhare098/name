package akshata12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step -3 
		 
		 driver.get("https://iwbms.mahabocw.in/registration-and-renewal/registration");
		 
		 
		WebElement dropdown=driver.findElement(By.className("form-control ng-pristine ng-invalid is-invalid ng-touched"));
		
		Select sel=new Select(dropdown);
		
	    sel.selectByVisibleText("Beed");
		
	
		 Thread.sleep(2000);
	}

}
