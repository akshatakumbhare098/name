package akshata12;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//step -1 
		WebDriverManager.chromedriver().setup();
		
		//step 2
		
		 WebDriver driver= new ChromeDriver();
		 
		 
		 //maximize window
		 
		 //step -3
		 
		 driver.get("https://newtours.demoaut.com/");
		 
		 //wait
		 
		 Thread.sleep(5000);
		 
		 //we need to capture all the links from the web page
		 
		 //1.capture links
		 //2.count number of links(Size)
		 
		 //capture all the  link 
		 
		List<WebElement>links =driver.findElements(By.tagName("a"));//store these links in the variable links list type of variable . every value is webelement
		 
		 
		 //numberof links
		System.out.println("links.size()");
	 // these will return you number of links present in the webpage
		 
		//now read the links each and every variablethen varify that links is providing proper url or not broken link or not
		
		for(int=0;i<links.size();i++)
		{
			//by using href attribute we ge url of require links
			
			WebElement element=links.get(i);// return element that element store variable element and this is Actual web element 
			
			//frome these element capture href attibute
			
			String url=element.getAttribute("href");//this provide exactly anchor tag store variable called url ..and these variable is string type
			
			//now we varify these url working fine or not
			
		//use special class url class
			
			URL link=new URL(url);
			
			//weneed to establish  connection link object 
			
			//HTTPURLConnection//basically this class is use for links is present in the target page or not without click on the link
			//create a connection using url object "link"
			URLConnection httpConn=link.openConnection();
			
			httpConn.connect();
			
			//connect is the method to establish connection.
			
			
			
			//httpConn establish connection
			
			//now capture the response code
			
			int rescode=httpConn.getResponseCode();
			
			
			//return responce code if res code is above 400 : broken link
			
			if(rescode>=400)
			{
				System.out.println(url +" "+ "is broken link");
				}
			else
				
			{
				System.out.println(url +" "+ "is valid link" );
			}
			}
		
	}

}
