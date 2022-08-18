package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7_3 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Apple");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		
		System.out.println(list.size());
		
		for(int a=0;a<list.size();a++)
		{
			System.out.println(list.get(a).getText());
			
			if(list.get(a).getText().equals("in Mobiles")) {
			
			list.get(a).click();
			break;
			
		}
	}

}}
