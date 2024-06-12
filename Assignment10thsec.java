package RealTimePractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment10thsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click(); 
		String selectedOption = driver.findElement(By.cssSelector("label[for*='bmw']")).getText();
		
		WebElement sdd = driver.findElement(By.id("dropdown-class-example"));
		Select dd = new Select(sdd);
		
		dd.selectByVisibleText(selectedOption);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		String alertTextoption = alertText.split(",")[0].split(" ")[1].trim();
		
		//Assert.assertEquals(alertTextoption, selectedOption);
		
		if(alertTextoption.equals(selectedOption)) {
			System.out.println("Alert success");
		}
		else
			System.out.println("Alert failed");
		driver.switchTo().alert().accept();

	}

}
