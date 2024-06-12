package Sel_practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKart_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4[class*='product-name']"));
		
		String[] rqItems = {"Capsicum","Apple","Mango"};
		
		int j =0;
		
		for(int i = 0; i<items.size(); i++) {
			
			String item = items.get(i).getText().split(" ")[0].trim();
			
			List<String> rqItemsList = Arrays.asList(rqItems);
			
			if(rqItemsList.contains(item)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==rqItems.length)
					break;
			}
			
		}

	}

}
