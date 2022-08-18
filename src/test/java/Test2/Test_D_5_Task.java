package Test2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class Test_D_5_Task extends BaseClass1 {
	
	
	@Test
	public void Test4() throws Exception {
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
		
		// Step 7...> Verify text "HAPPY Independence Day"
		WebElement Independ=driver.findElement(By.xpath("//img[@alt='Happy Independence Day']"));
		String actual=Independ.getText();
		
		String Actual= actual;
		String Expected="Happy Independance Day";
		
		Assert.assertEquals(Actual, Expected);
		System.out.println("done");
		
	}

}
