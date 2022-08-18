package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_3_Base_Test {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		// Browser Open
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	@AfterMethod 
	public void tearDown() {
		//Browser close
		driver.close();
	}

}
