package Test;

import java.io.FileInputStream;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9_6_Excel_d {

	public static void main(String[] args) throws Exception {
		// Open Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Enter Email id Value by using Relative xpath(attribute)
		WebElement txt_email= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
		// Coding for fetch the data from Excelsheet
		String path="C:\\Users\\SMART\\eclipse-workspace\\P_Project\\Test_data\\Excel data.xlsx";	
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		// Fetch the data from Excelsheet
		String data1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		String data3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();	
		System.out.println(data3);
		
		// Send test data to webelement
		txt_email.sendKeys(data1);       // for username 
		pass.sendKeys(data2);            // for passward
		
		
		double data4=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();	
		System.out.println(data4);
		
		//Here we use replace method for change in numaric value
		String data4s=String.valueOf(data4);
		String data=data4s.replace(".0", "");
		System.out.println(data);
		
		pass.sendKeys(data);
		
	 
		
	}

}
