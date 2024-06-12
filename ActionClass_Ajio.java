package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("li[data-test*='li-MEN']"))).build().perform();

	}

}
