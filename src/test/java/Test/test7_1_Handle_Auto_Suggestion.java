package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7_1_Handle_Auto_Suggestion {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver drivar=new EdgeDriver();
	
		drivar.get("https://www.google.co.in/webhp");
		drivar.manage().window().maximize();                           
		
		// Find Element by using Relative xpath (Attribute)                    // AUTOSUGGESTION//
		WebElement search=drivar.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Maven");
		Thread.sleep(3000);
		
		//Find List of Element ......>ul(parent webElement ).....>li(child WebElement in list)
		List<WebElement> list=drivar.findElements(By.xpath("//ul[@class='G43f7e']/li"));
            System.out.println(list.size());
            
            // using for loop we found perticular index & Get them
            for(int i=0;i<list.size();i++) {        
            	System.out.println(list.get(i).getText());
            	
            	// Maching the Index & find them
            	if(list.get(i).getText().equals("Mavenir")){ 
            		list.get(i).click();
            		break;
            		
            	}
            }
            	
            	
            	
            
            
        // System.out.println(list.get(5).getText());
       //  list.get(5).click();
		
	}

}
