package Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test9_8_Task {

	public static void main(String[] args) throws Exception {

		
		// Open Browser
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  //Open APP uri
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
	      driver.manage().window().maximize();
	      
	      
	      WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
	      WebElement Lname= driver.findElement(By.xpath("//input[@name='lastName']"));
	      WebElement phone= driver.findElement(By.xpath("//input[@name='phone']"));
	      WebElement Email= driver.findElement(By.xpath("//input[@id='userName']"));
	      WebElement Adrs= driver.findElement(By.xpath("//input[@name='address1']"));
	      WebElement city= driver.findElement(By.xpath("//input[@name=\'city\']"));
	      WebElement state= driver.findElement(By.xpath("//input[@name='state']"));
	      WebElement code= driver.findElement(By.xpath("//input[@name='postalCode']"));
	      WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
			  
	      Select sel=new Select(drp);
			Thread.sleep(3000);
			sel.selectByValue("INDIA");
	      WebElement uname= driver.findElement(By.xpath("//input[@name='email']"));
	     WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
	      WebElement cpass= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	      WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
	      
	      //
	    String taskpath="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\Test_data\\Task.xlsx";
	    FileInputStream fis=new FileInputStream(taskpath);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    
	    //
	   String a1= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   System.out.println(a1);
	   String a2= wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	   System.out.println(a2);

	   String a3= wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	   System.out.println(a3);

	   String a4= wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	   System.out.println(a4);

	   String a5= wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
	   System.out.println(a5);

	   String a6= wb.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
	   System.out.println(a6);

	   String a7= wb.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
	   System.out.println(a7);

	   String a8= wb.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
	   System.out.println(a8);

	   String a9= wb.getSheet("Sheet1").getRow(8).getCell(0).getStringCellValue();
	   System.out.println(a9);

	   String a10= wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
	   System.out.println(a10);

	   String a11= wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
	   System.out.println(a11);

	   String a12= wb.getSheet("Sheet1").getRow(11).getCell(0).getStringCellValue();
	   System.out.println(a12);
	 
	   name.sendKeys(a1);
	 //  Thread.sleep(5000);
	   Lname.sendKeys(a2);
	 //  Thread.sleep(5000);
	   phone.sendKeys(a3);
	 //  Thread.sleep(5000);
	   Email.sendKeys(a4);
	   Adrs.sendKeys(a5);
	 //  Thread.sleep(5000);
	   city.sendKeys(a6);
	  // Thread.sleep(5000);
	   state.sendKeys(a7);
	//   Thread.sleep(5000);
	   code.sendKeys(a8);
	//   Thread.sleep(5000);
	   drp.sendKeys(a9);
	 //  Thread.sleep(5000);
	   uname.sendKeys(a10);
	 //  Thread.sleep(5000);
	   pass.sendKeys(a11);
	  // Thread.sleep(5000);
	   cpass.sendKeys(a12);
	   submit.click();
	   
	     String path1="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\task_";
		    String s= RandomString.make(5);
		     TakesScreenshot ts=(TakesScreenshot) driver;
		    File src= ts.getScreenshotAs(OutputType.FILE);
		    File destn=new File(path1+"\\"+s+".png");
		    FileUtils.copyFile(src, destn);
	Thread.sleep(5000);
	   WebElement login=driver.findElement(By.xpath("//a[@href='login.php']"));
	   login.click();
	   Thread.sleep(3000);
	  WebElement username= driver.findElement(By.xpath("//input[@name='userName']"));
        username.sendKeys("prakash");
       WebElement passward= driver.findElement(By.xpath("//input[@name='password']"));
	     passward.sendKeys("123456");
	     WebElement submit1=driver.findElement(By.xpath("//input[@name='submit']"));
	     submit1.click();
	}

}
