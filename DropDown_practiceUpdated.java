package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_practiceUpdated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);
		
		for(int i = 1; i<5; i++) {
		driver.findElement(By.cssSelector("span[id*='IncAdt']")).click();
		}
		
		driver.findElement(By.cssSelector("input[id*='paxoption']")).click();
		
		WebElement sdd = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select dd = new Select(sdd);
		
		dd.selectByIndex(1);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByValue("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByVisibleText("USD");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		driver.close();
	}

}
