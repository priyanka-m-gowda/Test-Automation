package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Con3 {
	
	@Test
  void XYZ() {
	  System.out.println("XYZ from Con3");
  }
	
	@AfterTest
	void efg()
	{
		System.out.println("efg from Con3");
	}
}
