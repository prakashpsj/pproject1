package Test2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3_Soft_Assert {
	
	// Soft Assert / Verify
	
	@Test
	public void Test5() {
		
		SoftAssert soft=new SoftAssert();    // here we need to create object of softassert
		
		
		System.out.println("Email");
		System.out.println("pass");
		System.out.println("login");
		
		String expected="JADHAV";
		String actual ="jadhav";
		
		soft.assertEquals(actual, expected);
		
		System.out.println("test done");
		
		soft.assertAll();                  //  assertall method is mandetary at the end of test case ... 
		
	}

}
