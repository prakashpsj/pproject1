package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_2AC {

	public static void main(String[] args) throws Exception {

	    // Open Browser...................................................> 1
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			
			// Open APP url..................................................> 2
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
			// Drag & Drop using Action Class .........
			
			Actions A=new Actions(driver);
		// 1	
			WebElement drg=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
			WebElement drop=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
      	   	A.dragAndDrop(drg, drop).build().perform();
			Thread.sleep(5000);
		//2	
			  WebElement g= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
			  WebElement f= driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
			  A.dragAndDrop(g, f).build().perform();
			  Thread.sleep(5000);
		//3	
			WebElement d=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement e=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		    A.dragAndDrop(d, e).build().perform();
		    Thread.sleep(5000);
		 //4   
		    WebElement c=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		   WebElement t= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		    A.dragAndDrop(c, t).build().perform();
		    
		    driver.close();
		    
		   
		    
	}

}
