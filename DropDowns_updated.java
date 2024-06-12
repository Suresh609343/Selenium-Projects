import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns_updated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		driver.findElement(By.className("paxinfo")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		Thread.sleep(2000);
		/*int i = 1;
		while(i<5) {
			
			driver.findElement(By.className("pax-enabled")).click();
			i++;
			
		}*/
		for(int i = 1; i<5; i++) {
			driver.findElement(By.className("pax-enabled")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
