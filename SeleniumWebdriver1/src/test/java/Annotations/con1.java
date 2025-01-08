package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//Annotation
//1)BeforeMethod, AfterMethod
//2)BeforeClass, AfterClass
//3)BeforeTest, AfterTest
//4)BeforeSuit, AfterSuit
//suit is a group of test cases
public class con1 {

	
	  @	BeforeMethod
	   void login()
	   {
		   System.out.println("login");
	   }
	   
	   @Test(priority=1)	
	   void search()
	   {
		   System.out.println("search");
	   }
	    
	   @Test(priority=2)	
	   void advsearch()
	   {
		   System.out.println("advsearch");
	   }
	   
	   @AfterMethod	
	   void logout()
	   {
		   System.out.println("logout");
	   }
}

