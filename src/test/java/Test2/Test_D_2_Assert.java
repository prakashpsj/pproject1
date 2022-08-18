package Test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2_Assert {
	  
	// Assert / Hard Assert
	@Test
	public void verify_test_1() {
		
		System.out.println("Email");
		System.out.println("pass");
		System.out.println("login button");
		
		String expected="PRAKASH";
		String actual="prakash"	;	
		Assert.assertEquals(actual, expected);    // Assert is used for verify the test case is passed/fail
		System.out.println("Test Done");
	}
	
	@Test
	public void test_2() {
		System.out.println("jadhav");
	}

}
