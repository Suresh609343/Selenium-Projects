package Sel_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_handling_salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/au/");
		
		driver.findElement(By.linkText("Start free trial")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("input[name*='UserFirstName']")).sendKeys("Suresh");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name*='UserFirstName']")));
		driver.findElement(By.cssSelector("input[name*='UserLastName']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[name*='UserEmail']")).sendKeys("sureshkumar30july@gmail.com");
		
		WebElement sdd = driver.findElement(By.cssSelector("select[name*='UserTitle']"));
		Select dd = new Select(sdd);
		
		dd.selectByValue("IT Manager");
		
		driver.findElement(By.cssSelector("input[name*='CompanyName']")).sendKeys("Mphasis");
		
		WebElement sdd2 = driver.findElement(By.cssSelector("select[name*='CompanyEmployees']"));
		Select dd2 = new Select(sdd2);
		
		dd2.selectByIndex(5);
		
		driver.findElement(By.cssSelector("input[name*='UserPhone']")).sendKeys("8919483051");
		
		WebElement sdd3 = driver.findElement(By.cssSelector("select[name*='CompanyCountry']"));
		Select dd3 = new Select(sdd3);
		
		dd3.selectByValue("India");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		//driver.findElement(By.xpath("//*[text()='Start my free trial']")).click();
		
		driver.switchTo().window(parentID);
		
		driver.quit();

	}

}
