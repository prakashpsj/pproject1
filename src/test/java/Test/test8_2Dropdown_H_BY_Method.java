package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8_2Dropdown_H_BY_Method {
	public static void dropdown(String text,WebElement Element) {
		Select p=new Select(Element);
		p.selectByVisibleText(text);
		
	}

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver Driver=new EdgeDriver();
		
		Driver.get("https://demo.guru99.com/test/newtours/register.php");
		Driver.manage().window().maximize();
		
		WebElement drp=Driver.findElement(By.xpath("//select[@name='country']"));
		
		dropdown("ARUBA",drp);
		Thread.sleep(5000);
		dropdown("INDIA",drp);
		
		
	}

}
