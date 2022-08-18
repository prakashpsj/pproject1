package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7_2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new  EdgeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("healthy food");
		Thread.sleep(2000);
		
                      List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
                      System.out.println(list.size());
                      
                     for(int p=0;p<list.size();p++) {
                    	  System.out.println(list.get(p).getText());
                    	  
                    	  if(list.get(p).getText().equals("healthy food list")) {
                    		  
                    		  list.get(p).click();
                    		  break;
                    		  
                    		  
                    	  }
                    	  
                  
                    	}
                      }

	}
