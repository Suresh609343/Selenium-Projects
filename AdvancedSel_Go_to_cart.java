import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedSel_Go_to_cart {

public static void main(String[] args) throws InterruptedException {
	
	// TODO Auto-generated method stub
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	driver.manage().window().maximize();
	
	String[] rqItems = {"Beans","Mushroom","Banana"};
	
	addItem(driver, rqItems);
	
	driver.findElement(By.cssSelector("img[alt*='Cart']")).click();
	
	driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	
	driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.xpath("//*[text()='Apply']")).click();
	
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class*='promoInfo']")));
	
	System.out.println(driver.findElement(By.cssSelector("span[class*='promoInfo']")).getText());
	
	}

	public static void addItem(WebDriver driver, String[] rqItems) {
		
		int j =0; 

		List<WebElement> items = driver.findElements(By.cssSelector("h4[class*='product-name']"));
		
		for(int i =0; i<items.size(); i++) {
			
			String rqItem = items.get(i).getText().split(" ")[0].trim();
			
			List<String> rqItemsList = Arrays.asList(rqItems);
			
			if(rqItemsList.contains(rqItem)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==rqItems.length)
					break;
			}
		}
		
	}


}

