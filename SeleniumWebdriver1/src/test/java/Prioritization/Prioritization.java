package Prioritization;

import org.testng.annotations.Test;

//test cases will execute in alphabetical order if we do not specify priority
public class Prioritization {

   @Test(priority=1)	
   void login()
   {
	   System.out.println("login");
   }
   
   @Test(priority=2)	
   void openapp()
   {
	   System.out.println("openapp");
   }
    
   @Test(priority=3)	
   void search()
   {
	   System.out.println("search");
   }
   
   @Test(priority=4)	
   void logout()
   {
	   System.out.println("logout");
   }
   
   
}
