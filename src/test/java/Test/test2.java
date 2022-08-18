package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) throws Exception {
		
       // Open the Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		// open the Application url
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);           //   Get Title
		
		String url=driver.getCurrentUrl();
		System.out.println(url);            // get url
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
	}

}
