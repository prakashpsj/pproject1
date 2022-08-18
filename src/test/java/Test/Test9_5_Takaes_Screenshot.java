package Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test9_5_Takaes_Screenshot {

	public static void main(String[] args) throws Exception {

		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		// Enter Email id Value by using Relative xpath(attribute)
		WebElement txt_email= driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("psj@21457");
		
		// Enter pass Value by using Relative xpath(attribute)
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("987456");
		
	//	Click on login button by using the Relative xpath(contains)
		WebElement clk=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		clk.click();
		
		//  Select path for Screenshot 
		String path="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\prakash";
		
		//Use Random String method 
		String p=RandomString.make(3);      // abc,pqr
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+p+".png");
		FileUtils.copyFile(src, destn);
		driver.close();
		
			
	}
		
	}

