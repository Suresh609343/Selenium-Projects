package Sel_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("#datepicker")).click();
		
		String year = driver.findElement(By.className("ui-datepicker-title")).getText().split(" ")[1];
		String month = driver.findElement(By.className("ui-datepicker-title")).getText().split(" ")[0];
		
		while(!(month.equals("July") && year.equals("2026"))) {
			
			driver.findElement(By.cssSelector("a[title*='Next']")).click();
			year = driver.findElement(By.className("ui-datepicker-title")).getText().split(" ")[1];
			month = driver.findElement(By.className("ui-datepicker-title")).getText().split(" ")[0];
		}
		driver.findElement(By.xpath("//td/a[text()='13']")).click();
	}

}
