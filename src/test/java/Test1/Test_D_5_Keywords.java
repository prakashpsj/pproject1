package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

      // Test cases are Execute According to alafhabate (According to Method/ test case name).
     //For execution of test cases According to requirement we use keyword
public class Test_D_5_Keywords {
	
	@Test(priority=2)   // <..................................Here we use Priority keyword for decide a priority of test case execution
	public void A() {
		System.out.println("I am A");
	}
	@Test(enabled=false)  // <...............................If we Dont want to Execute Perticular test case then we use  enabled=false keyword
	public void B() {
		System.out.println("I am B");
		
	}
	@Test
	public void C() {
		System.out.println("I am C");
		Assert.assertTrue(false); //<...........   true=false

	}
	@Test(dependsOnMethods="C") // <...If we want Execution of test case after the any test case that we want then we use (dependsOnMethods)keyword
	public void D() {
		System.out.println("I am D");
	}
	@Test(invocationCount=4)  //<........If we want to execute test case no of times that given by us that time we use (invocationCount)keyword
	public void E() {
		System.out.println("I am E");
	}

}
