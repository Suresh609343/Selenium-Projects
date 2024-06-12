package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class_flipkart_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("div[class*='H6-NpN _3N4_BX']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.cssSelector("div[class*='_2SmNnR']"))).click().sendKeys("iphone").keyDown(Keys.SHIFT).doubleClick().build().perform();
	}

}
