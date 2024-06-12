
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns_updated2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	}

}
