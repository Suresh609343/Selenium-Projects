import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("#ui-id-1"));
		
		for(WebElement option : options) {
			if(option.getText().contains("India")){
				option.click();
				break;
			}
		}
		
		/*driver.findElement(By.cssSelector("label[for*='Trip_1']")).click();
		driver.findElement(By.cssSelector("label[for*='Trip_0']")).click();
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i =0; i<5; i++) {
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
		WebElement sdd = driver.findElement(By.cssSelector("select[name*='DropDownListCurrency']"));
		
		Select dd = new Select(sdd);
		
		dd.selectByValue("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		driver.close(); */
	
	}

}
