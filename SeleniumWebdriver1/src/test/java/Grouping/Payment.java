package Grouping;

import org.testng.annotations.Test;

public class Payment {

	@Test(groups= {"regression"})
	void phonepay()
	{
		System.out.println("phonepay");
	}
	
	@Test(groups= {"regression"})
	void paytm()
	{
		System.out.println("paytm");
	}
	
	@Test(groups= {"regression"})
	void Googlepay()
	{
		System.out.println("googlepay");
	}
}
