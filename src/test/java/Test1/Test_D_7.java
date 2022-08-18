package Test1;

import org.testng.annotations.Test;

public class Test_D_7 {
	
	@Test(groups="Sanity")
	public void test_A(){
		System.out.println("A");
		
	}
	@Test(groups="Critical Regression")
	public void test_B(){
		System.out.println("B");
		
	}
	@Test(groups="Regression")
	public void test_C(){
		System.out.println("C");
		
	}
	@Test(groups="Regression")
	public void test_D(){
		System.out.println("D");
		
	}

}
