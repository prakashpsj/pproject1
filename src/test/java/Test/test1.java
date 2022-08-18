package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println("url");
		
		
		WebElement txt_id=driver.findElement(By.id("email"));
		txt_id.sendKeys("pj@1234");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("1234");
	}

}
