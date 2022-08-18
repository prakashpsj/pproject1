package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {

	public static void main(String[] args) throws Exception {

		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		// Enter Email id Value by using Relative xpath(attribute)
		WebElement txt_email= driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("psj@21457");
		
		// Enter pass Value by using Relative xpath(attribute)
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("987456");
		
	//	Click on login button by using the Relative xpath(contains)
		WebElement clk=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		clk.click();
		
		// Click on forgot pass button by Relative xpath(text)
        WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot.click();
		
		Thread.sleep(3000);
		
		WebElement name=driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		name.sendKeys("prakash");
		
		
		 
	}

}
