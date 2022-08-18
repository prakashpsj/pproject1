package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {

	public static void main(String[] args) throws Exception {
      // open the browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		// open application url    
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		// Send login Values by using relative (xpath by Attribute) xpath
		WebElement login_id=driver.findElement(By.xpath("//input[@id='email']"));
		login_id.sendKeys("p12458");
		
		// Send login Values by using relative (xpath by Attribute) xpath
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pass.sendKeys("456789");
		
		// Send login Values by using relative (xpath by Attribute) xpath
		WebElement clk=driver.findElement(By.xpath("//button[@name='login']"));
		clk.click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
