package Sel_practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		
		int j =0;
		
		String[] rqItems = {"Jacket","Backpack","Light"};
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		
		for(int i=0; i<items.size(); i++) {
			
			String eachItem = items.get(i).getText();
			
			System.out.println(eachItem);
			
			/*List<String> rqItemsList = Arrays.asList(rqItems);
			
			if(rqItemsList.contains(eachItem)){
				
				j++;
				driver.findElements(By.cssSelector("button[class*='btn_inventory']")).get(i).click();
				
				if(j==rqItems.length)
					break;*/
			}
		}
		
		/*driver.findElement(By.tagName("svg")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='CHECKOUT']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("first-name")).sendKeys("Suresh");
		driver.findElement(By.id("last-name")).sendKeys("Kumar");
		driver.findElement(By.id("postal-code")).sendKeys("523002");
		driver.findElement(By.cssSelector("input[value*='CONTINUE']")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.cssSelector("div[class*='summary_subtotal_label']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class*='summary_tax_label']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class*='summary_total_label']")).getText());

		driver.findElement(By.xpath("//*[text()='FINISH']")).click(); */
		

	}

}
