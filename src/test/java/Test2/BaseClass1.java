package Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	WebDriver driver;
	@BeforeMethod
	@Parameters({"BrowserName"})
	public void BM(String Browsername) throws Exception {
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
		}
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	}
	@AfterMethod
	public void Am() {
		driver.close();
	}

}
