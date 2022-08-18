package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test9_9_task {

	public static void main(String[] args) throws Exception {

		// Open Browser
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  //Open APP uri
		  driver.get("https://demo.guru99.com/test/newtours/login.php");
	      driver.manage().window().maximize();
	      WebElement login=driver.findElement(By.xpath("//a[@href='login.php']"));
		   login.click();
		   Thread.sleep(3000);
		  WebElement username= driver.findElement(By.xpath("//input[@name='userName']"));
	        username.sendKeys("prakash");
	        Thread.sleep(3000);
	       WebElement passward= driver.findElement(By.xpath("//input[@name='password']"));
		     passward.sendKeys("123456");
		     Thread.sleep(3000);
		     WebElement submit1=driver.findElement(By.xpath("//input[@name='submit']"));
		     submit1.click();
		     
		     String path1="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\task_";
		    String s= RandomString.make(5);
		     TakesScreenshot ts=(TakesScreenshot) driver;
		    File src= ts.getScreenshotAs(OutputType.FILE);
		    File destn=new File(path1+"\\"+s+".png");
		    FileUtils.copyFile(src, destn);
	
	
	
	}

}
