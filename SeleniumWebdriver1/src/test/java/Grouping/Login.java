package Grouping;

import org.testng.annotations.Test;

public class Login {

	@Test(groups= {"sanity"})
	void email()
	{
		System.out.println("email");
	}
	
	@Test(groups= {"sanity"})
	void phoneno()
	{
		System.out.println("phoneno");
	}
	
	@Test(groups= {"sanity"})
	void facebook()
	{
		System.out.println("facebook");
	}
}
