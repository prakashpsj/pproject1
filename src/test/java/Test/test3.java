package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) throws Exception {
     
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		// Identify the WebElement .....>Locators.....> Id
		
	WebElement txt_email=driver.findElement(By.id("email"));
	txt_email.sendKeys("psj@1245");
	
	// Identify the WebElement .....>Locators.....> Name

	WebElement txt_passward=driver.findElement(By.name("pass"));
	txt_passward.sendKeys("159763");
	
	WebElement btn_login=driver.findElement(By.name("login"));
	btn_login.click();
	Thread.sleep(5000);
	driver.close();
	
	
	}

}
