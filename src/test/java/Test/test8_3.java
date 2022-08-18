package Test;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8_3 {

	public static void main(String[] args) throws Exception {
		
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Select sel=new Select(drp);
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		
		sel.selectByIndex(107);
		Thread.sleep(5000);
		sel.selectByValue("HUNGARY");
		Thread.sleep(5000);

		sel.selectByVisibleText("INDIA");
		Thread.sleep(5000);

		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int p=0;0<list.size();p++) {
			System.out.println(list.get(p).getText());
			
			if(list.get(p).getText().equals("RUSSIA")) {
				
				break;
			}
		}
		
			
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
	


