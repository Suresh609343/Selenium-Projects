package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentPractcice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Suresh");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sureshkumar30july@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("6093430Sm*");
		driver.findElement(By.xpath("//div/input[@id='exampleCheck1']")).click();
		
		WebElement sdd = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		
		Select dd = new Select(sdd);
		dd.selectByIndex(0);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@max='3000-12-31']")).sendKeys("30-07-2000");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
	}

}
