package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_6_Scrolling {
	
	@Test
	public void  Scrool() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		// Scroll By pixel
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(5000);
		// Scrool By Element
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()", english);
		
		
		
		driver.close();
	}

}
