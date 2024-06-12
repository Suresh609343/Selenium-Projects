import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		WebElement sdd = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select dd = new Select(sdd);
		
		dd.selectByValue("USD");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByIndex(1);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByVisibleText("AED");
		System.out.println(dd.getFirstSelectedOption().getText());

	}

}
