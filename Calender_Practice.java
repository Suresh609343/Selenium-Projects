package Demo_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
		
		String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(aMonth.equals("August") && aYear.equals("2027"))) {
			
			driver.findElement(By.xpath("//div/a[@title='Next']")).click();
			aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/*[text()='10']")).click();
	}

}
