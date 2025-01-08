package Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Con2 {

	@Test
	void abc()
	{
		System.out.println("from Con2");
	}
	 
	@BeforeTest
	void bt()
	{
		System.out.println("bt from Con2");
	}
}
