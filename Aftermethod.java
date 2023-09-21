package akshatapractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Aftermethod {
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this  is test2");
	}


}


