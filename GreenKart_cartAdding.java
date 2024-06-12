package Sel_practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKart_cartAdding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		
		String[] rqVeggies = {"Cucumber","Carrot","Beetroot","Beans"};
		
		List<WebElement> veggies = driver.findElements(By.cssSelector("h4[class*='product-name']"));
		
		int j =0;
		
		for(int i = 0; i<veggies.size(); i++) {
			
			//String veggie = veggies.get(i).getText();
			
			List<String> rqVeggiesList = Arrays.asList(rqVeggies);
			
			String rqVeggie = veggies.get(i).getText().split(" ")[0];
			
			if(rqVeggiesList.contains(rqVeggie)) {
				
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==rqVeggies.length)
					
					break;
			}
			
		}


	}

}
