package Grouping;

import org.testng.annotations.Test;

public class category {

	@Test(groups= {"regression","sanity","functional"})
	void male()
	{
		System.out.println("male");
	}
	
	@Test(groups= {"regression","sanity","functional"})
	void female()
	{
		System.out.println("female");
	}
	
	@Test(groups= {"regression","sanity","functional"})
	void kids()
	{
		System.out.println("kids");
	}
}
