package akshata12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHndling {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 
		 //step 1 
		 
		 
		 WebDriver driver= new ChromeDriver();
		 
          //Step -2 
		 
		 driver.manage().window().maximize();
		 
		 //step-3 
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 // ya step nantr aplyaya id ghyaychi aahe browser window  chi tyachyasathi 2 method aahe 
		 
		 //1st getWindowHandle 
		 
		 //2nd getwindowhandles 
		 
		 //by using these methods we get the id of the browser window
		 
		 //get window handle written string
		 
		 //set window handle written list of string //all id are in the string format
		 
		// 1st getwindowhandle
		 
		 
		 String windowid=driver.getWindowHandle();
		 
		 System.out.println(windowid);//855593997643D6B850C696ABA739BA19 by using these we generate the window id
		 
		 //By using these we get the id of the single browser  window ..it is the form of string store in the variable
		 
		 //now we are creating the id of the multiple window
		 
	//tyapage ek element asel jo dusri window open krel to inspect kun new wali browser window open karayachi//child window 
		 
		 
		 //child window open
		 
		 driver.findElement(By.xpath("abcd")).click();
		 
		 Set<String> windowIDs=driver.getWindowHandles(); //these method gives set of the string ..these method give the both the id ..parent id and child id
		 
		 
		 
		 //return ids of multiple browser windows
		 
		 //set a collection in java 
		 
		 //and then we retrive the id from the variable
		 
		 //1st method
		 
		 //1.iterator()..use with collections
		 
		Iterator<String> it = windowIDs.iterator();// this we wtitten iterator object
		 
		//from window id use iterator method which written iterator object of string.
		
		String parentID=it.next(); //this will give the first window id..these id store in variable...writtesn the parent window id
		
		
		String childID=it.next();
		 
		 
		 System.out.println("Parent window id:" +parentID);
		 
		 System.out.println("Child window id:" +childID);
		 
		 
		 
		 //this we get the parent window id and child window id
		 
		 //we can get the both window ids
		 
		 //ids use for to switch one browser window to another browser window
		 
		 //when we click on the link or element we will not switch 2 browser window
		 
		 //when we perform action on the second window not possible. directly. bacause browser id pointing the parent window
		 
		 //to switch browser window need of id by using window id we can switch browser window and we can perform the activity..perform the activity on 
		 
		 //child window 
		 
		 //now how wee can switch between one browser window to another broswer window
		 
		 //how to use window id for switching purpose
		 
		 //aaata aapan pahili wali window open kwli aahe ..aani tya element chya element la inspect krun click action perform karun 2 nd 
		 
		 //window open zali aahe apan tyavar operation perform nhi karu shakat directly..mnun aadhi switch karava lagel
		 
		 driver.switchTo().window(parentID);
		 
		 System.out.println("Parent window title"+ driver.getTitle());
		 
		 driver.switchTo().window(childID);
		 
		 System.out.println("Child window title"+ driver.getTitle());
		 
		 //we use for each loop...2nd way
		 
		 //getting the id in 1 shot
		 
		 for(String winid:windowIDsList)

		 {
			 String title=driver.switchTo().window(winid).getTitle();
			 
			 System.out.println(title);
			 
			 
		 }
          
		    //let us say i have multiple browser window 1 parent and 1 child ...one browser window is close then we use close command
		 
		 //close is use for to close specific /single browser window
		 
		 //which ever browser is pointing too that browser will close
		 
		 //and use quit command close all the browser windows
		 
		 driver.close(); //this will close single broswer window
		 
		 //jya webdriver point aaho to close honar
		 
		 
		
	}

}
