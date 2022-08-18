package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_7Poup_up_H_Alert {

	public static void main(String[] args) throws Exception {

		// Open Browser
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  //Open APP uri
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
	      driver.manage().window().maximize();
	      // Find web element 
	     WebElement id= driver.findElement(By.xpath("//input[@type='text']"));
	     id.sendKeys("123456");
	     Thread.sleep(3000);
	     WebElement sub=driver.findElement(By.xpath("//input[@type='submit']"));
	     sub.click();
	     Thread.sleep(3000);
	     
	     // Poup_up Handling by alert 
	    Alert alt= driver.switchTo().alert();   // for Swith on alert window
	    Thread.sleep(5000);
	    
	   String alert= alt.getText();     
	    System.out.println(alert);            // Here we get the text on console that available on alert tab
	    Thread.sleep(3000);
	   // alt.dismiss();                     // for dismiss the alert
	     alt.accept();
	     
	     String alert1=alt.getText();
	     System.out.println(alert1);        // for getting the next alert window text
	     
	     alt.accept();                      // for accepting the alert 
	     Thread.sleep(6000);
	     driver.close();
	     
	     
	     
	     
	     
	     
	}

}
