package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test6 {

	public static void main(String[] args) {

		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 // Click on Create new account button by using Relative xpath (contains)
		 
		WebElement clk= driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		 clk.click();
			// Relative Xpath (by index)
			WebElement txt_name=driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
			txt_name.sendKeys("prakash");
	
			 
		 
	}

}
