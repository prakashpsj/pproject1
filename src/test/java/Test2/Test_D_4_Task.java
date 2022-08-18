package Test2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_D_4_Task   {
	WebDriver driver;
	@Test
	public void Test1() throws Exception {
		
		// step 1......> Open Chrome browser
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Step 2...> Enter mobile to search bar
		WebElement src=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		src.sendKeys("Mobile");
		
		// Step 3...> Click on search button
		WebElement sbtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		sbtn.click();
		Thread.sleep(5000);
		
		// Step 4...> Click on first mobile appear.
		WebElement mo=driver.findElement(By.xpath("//img[@alt='Samsung Galaxy M13 (Midnight Blue, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']"));
		mo.click();
		
		// Step 5...> Take screenshot of mobile
		String path="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\prakash";
		String Rm=RandomString.make(7);
		TakesScreenshot srcs=(TakesScreenshot) driver;
	File f1=srcs.getScreenshotAs(OutputType.FILE);
	File f2=new File(path+"\\"+Rm+".png");
	FileUtils.copyFile(f1, f2);
	
	//Step 6...>Print name of mobile on console
	WebElement title1= driver.findElement(By.xpath("//span[@id='productTitle']"));
		String title=driver.getTitle();
		System.out.println(title);
		
		// Step 7...> Verify Text
		WebElement Independ=driver.findElement(By.xpath("//span[text()='Returns']"));
		String actual=Independ.getText();
		
		String Actual= actual;
		String Expected="Returns";
		
		Assert.assertEquals(Actual, Expected);
		System.out.println("done");
		
		
	}
	
	@AfterMethod
	public void Test_2() {
driver.close();
	}

}
