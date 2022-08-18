package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.JavascriptExecutor;

public class Test_D_7_Scrool_Method {
	@Test
	
	//public void scrool1() {
		
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.facebook.com/login.php/");
	//	driver.manage().window().maximize();
		//WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		//custom_scroll(driver,english);
		
		
	//}
	public static void custom_scroll(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

}
