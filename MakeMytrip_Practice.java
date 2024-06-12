package Sel_practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector(".menu_Flights")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".selected")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for*='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class*='input react-autosuggest']")).sendKeys("Vij");
		Thread.sleep(1000);
		List<WebElement> From_options = driver.findElements(By.cssSelector("ul[role='listbox']"));
		
		//int count = 0;
		for(WebElement option : From_options) {
			
			if(option.getText().contains("Vijayawada, India")) {
				option.click();
				//count++;
				break;
			}
		}
		driver.findElement(By.cssSelector("label[for*='toCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Par");
		
		List<WebElement> To_options = driver.findElements(By.cssSelector(".react-autosuggest__suggestions-list"));
		
		for(WebElement option : To_options) {
			
			if(option.getText().contains("France")) {
				option.click();
				break;
			}	
		}
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("//div[@role='grid'][1] //*[text()='11']")).click();
		driver.findElement(By.linkText("Tap to add a return date for bigger discounts")).isEnabled();
		
		driver.findElement(By.cssSelector("div[class*='flightTravllers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-cy*='adults-6']")).click();
		
		driver.findElement(By.cssSelector("li[data-cy='travelClass-1']")).click();
		driver.findElement(By.cssSelector("button[data-cy*='travellerApplyBtn']")).click();
		
		driver.findElement(By.cssSelector("#top-banner > div.minContainer > div > div > div > div.fsw > div.makeFlex.hrtlCenter.appendBottom20.flightFare > div.makeFlex.hrtlCenter > ul > li:nth-child(1) > p")).click();
		driver.findElement(By.cssSelector("a[class*='primaryBtn font24 latoBold widgetSearchBtn ']")).click();*/
	}
}
