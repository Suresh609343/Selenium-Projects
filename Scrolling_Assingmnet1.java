package Scrolling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Assingmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-display'] //tr"));
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table-display'] //tr //th"));
		
		System.out.println("No.of rows in the table :" + rows.size());
		System.out.println("No.of columns in the table :" + columns.size());
		
		System.out.println(rows.get(2).getText());

	}

}
