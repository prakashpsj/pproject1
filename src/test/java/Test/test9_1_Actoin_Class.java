package Test;

import java.awt.Desktop.Action;

//import java.awt.Desktop.Action;
//import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_1_Actoin_Class {

	public static void main(String[] args) throws Exception {
		
       // Open Browser...................................................> 1
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		// Open APP url..................................................> 2
		//driver.get("https://www.google.co.in/");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Find Xpath by using the Relative Xpath(Attribute)................>3
		WebElement clk= driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		
		//Create a object of Actons class  for <move>,<right click>,<double click> on WebElemwnt..........>4
		Actions p=new Actions(driver); 
		
		//  Move Towards Element & click on it.
		p.moveToElement(clk).click(clk).build().perform();
		
		//WebElement move=driver.findElement(By.xpath("//a[text()='Gmail']"));
		//Thread.sleep(5000);
		//p.moveToElement(move).build().perform();
		
		//Right click on WEbElement
		WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		p.contextClick(rclick).build().perform();
		// Double click on WebElement 
		WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		p.doubleClick(dclick).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
	}

}
