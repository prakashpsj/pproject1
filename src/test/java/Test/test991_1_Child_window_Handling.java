package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test991_1_Child_window_Handling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		// Get Parent Window  Address
		String parentwindowaddress=driver.getWindowHandle();
		System.out.println(parentwindowaddress);
		
		// find xpath of click webElement
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();               //identify the webelement
		
		// TO Handle The Child Window
		 Set<String> alladdress=driver.getWindowHandles();
		 System.out.println(alladdress);
		 
		 Iterator<String> it=alladdress.iterator();
		 
		 while(it.hasNext()) {
			 
			 String childwindowaddress=it.next();
			 
			 
			 if(! parentwindowaddress.equals(childwindowaddress)) {
			 
			 driver.switchTo().window(childwindowaddress);
			 
			 // Find Xpath of the web element present on child window
			 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456");
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			 Thread.sleep(5000);
			 driver.close();	 	 
		 }	
}         // Switch on parent Window  
		 driver.switchTo().window(parentwindowaddress);
		 Thread.sleep(5000);
		 driver.close();
}
}
	