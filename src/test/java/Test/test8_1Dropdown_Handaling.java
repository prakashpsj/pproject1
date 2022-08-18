package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8_1Dropdown_Handaling {

	public static void main(String[] args) throws Exception {

		// Open browser
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//open url
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		
		// create object of select class
		Select sel=new Select(drp);
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		// Select by using index
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		// Select by using value
		sel.selectByValue("INDIA");
		Thread.sleep(3000);
		
		// Select by using visible text
		sel.selectByVisibleText("AUSTRALIA");
		Thread.sleep(5000);
		
		// Here we find list size
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int t=0;t<list.size();t++) {
			
			System.out.println(list.get(t).getText());
			if(list.get(t).getText().equals("SENEGAL")) {
				
			break;
			
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
