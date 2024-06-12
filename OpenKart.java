package Demo_Projects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://awesomeqa.com/ui/");
		
		String[] rqItems = {"iPhone","MacBook"};
		
		List<WebElement> products = driver.findElements(By.xpath("//div/h4"));
		
		for(int i = 0; i<products.size(); i++) {
			
			List rqItemsList = Arrays.asList(rqItems);
			
			String product = products.get(i).getText();
			
			if(rqItemsList.contains(product)) {
				
				driver.findElement(By)
				
			}
		}
		

	}

}
