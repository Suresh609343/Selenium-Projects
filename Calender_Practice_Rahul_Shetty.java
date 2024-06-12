package RealTimePractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Practice_Rahul_Shetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("div[class*='inputGroup']")).click();
		
		String month = driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).getText().split(" ")[0]; 
		String year = driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).getText().split(" ")[1];
		
		while(!(month.equals("June") && year.equals("2027"))) {
			
			driver.findElement(By.cssSelector("button[class*='next-button']")).click();
			month = driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).getText().split(" ")[0];
			year = driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).getText().split(" ")[1];
		}
		driver.findElement(By.xpath("//button/abbr[text()='15']")).click();
		
		String actualDate = driver.findElement(By.cssSelector("div[class*='inputGroup']")).getText();
		System.out.println(actualDate);

	}

}
