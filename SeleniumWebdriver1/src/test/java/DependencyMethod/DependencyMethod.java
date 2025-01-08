package DependencyMethod;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependencyMethod {

	  @Test()	
	   void login()
	   {
		   System.out.println("login");
		   Assert.assertTrue(true);
	   }
	   
	   @Test(priority=1,dependsOnMethods= {"login"})	
	   void openapp()
	   {
		   System.out.println("openapp");
		   Assert.assertTrue(true);
	   }
	    
	   @Test(priority=2,dependsOnMethods= {"login","openapp"})	
	   void search()
	   {
		   System.out.println("search");
	   }
	   
	   @AfterTest()	
	   void logout()
	   {
		   System.out.println("logout");
	   }
}
