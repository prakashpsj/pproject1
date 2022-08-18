package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_4keyboard_MouseMoment {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		// Open APP url....
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.keyDown(email,Keys.SHIFT).sendKeys("text").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		Thread.sleep(5000);
		act.keyDown(pass, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
	}

}
