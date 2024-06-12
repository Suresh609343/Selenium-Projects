package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement sdd = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select dd = new Select(sdd);
		dd.selectByValue("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByIndex(1);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByVisibleText("USD");
		System.out.println(dd.getFirstSelectedOption().getText());
	}

}
