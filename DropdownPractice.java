package Sel_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("li[class*='Flights']"));
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li[class='selected']")).click();
		driver.findElement(By.xpath("//label/input[@id='fromCity']")).sendKeys("De");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		String S = "New Delhi, India";
		for(WebElement option :options) {
			
			if(option.getText().contains(S)) {
				option.click();
				break;
			
			//System.out.println(option.getText());
			}
}
}
}