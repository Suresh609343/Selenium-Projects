import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("li[data-cy*='menu_Flights']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li[data-cy*='oneWayTrip']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder*='From']")).sendKeys("Bom");
		Thread.sleep(1000);
		
		List<WebElement> Fromoptions = driver.findElements(By.cssSelector("ul[class*='react-autosuggest__suggestions-list']"));
		
		clickFrom(driver, Fromoptions);
		
		driver.findElement(By.cssSelector("label[for*='toCity']")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[placeholder*='To']")).sendKeys("Kol");
		Thread.sleep(1000);
		
		List<WebElement> Tooptions = driver.findElements(By.cssSelector("ul[class*='react-autosuggest__suggestions-list']"));
		
		clickTo(driver, Tooptions);
		
		String aMonth = driver.findElement(By.xpath("//div/div[@class='DayPicker-Caption']")).getText().split(" ")[0];
		String aYear = driver.findElement(By.xpath("//div/div[@class='DayPicker-Caption']")).getText().split(" ")[1];
			
		while(!(aMonth.equals("January") && aYear.equals("2025"))) {
				
				driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[@aria-label='Next Month']")).click();
				aMonth = driver.findElement(By.xpath("//div/div[@class='DayPicker-Caption']")).getText().split(" ")[0];
				aYear = driver.findElement(By.xpath("//div/div[@class='DayPicker-Caption']")).getText().split(" ")[1];
			}
		driver.findElement(By.xpath("//div[@class='DayPicker-Body'] //div[@aria-label='Wed Jan 15 2025']")).click();
		}
	
	public static void clickFrom(WebDriver driver, List<WebElement> Fromoptions) {
		
		for(WebElement option : Fromoptions) {
			
			if(option.getText().contains("Mumbai, India")) {
				option.click();
				break;
			}
		}
	}
	
	public static void clickTo(WebDriver driver, List<WebElement> Tooptions) {
		
		for(WebElement option : Tooptions) {
			
			if(option.getText().contains("Kolkata, India")){
				
				option.click();
				break;
			}
		}

	}
}