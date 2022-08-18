package Test;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7_4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement sec=driver.findElement(By.xpath("//input[@name='q']"));
		sec.sendKeys("laptops");
		Thread.sleep(5000);
		List <WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		
		for(int d=0;d<list.size();d++)	{
			
			System.out.println(list.get(d).getText());
			
			if(list.get(d).getText().equals("laptops for students")) {
				list.get(d).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
