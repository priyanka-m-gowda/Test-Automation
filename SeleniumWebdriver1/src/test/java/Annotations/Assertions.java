package Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
  
	@Test
	void verifytitle()
	{
		String expec_title="Your Store";
		String actual_title="Youur Store";
		Assert.assertEquals(expec_title, actual_title);
	}
	
	@Test
	void login()
	{
		System.out.println("login");
		Assert.assertTrue(false);
	}
}
