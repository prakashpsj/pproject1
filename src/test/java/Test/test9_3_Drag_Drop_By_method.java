package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_3_Drag_Drop_By_method {
	
	
	public static void DragDrop(WebDriver driver,WebElement Element,WebElement Element1) {
		
		Actions S=new Actions(driver);
		
		S.dragAndDrop(Element, Element1).build().perform();
	}

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		// Open APP url..................................................> 2
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// 1	
		WebElement drg=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
		WebElement drop=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
  	   	DragDrop(driver, drg, drop);
		Thread.sleep(5000);
	//2	
		  WebElement g= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		  WebElement f= driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
		 DragDrop(driver,g,f);
		  Thread.sleep(5000);
	//3	
		WebElement d=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement e=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    DragDrop(driver,d,e);
	    Thread.sleep(5000);
	 //4   
	    WebElement c=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	   WebElement t= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	 DragDrop(driver,c,t);
	    
	    driver.close();
	    
	   
		
		
		
		
	}

}
