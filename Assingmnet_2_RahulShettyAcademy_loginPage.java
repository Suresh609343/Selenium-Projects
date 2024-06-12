package Sel_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingmnet_2_RahulShettyAcademy_loginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String Unp = driver.findElement(By.cssSelector("p[class='text-center text-white']")).getText();
		
		String userName = Unp.split("and")[0].split("is")[1].trim();
		
		String pass = Unp.split("and")[1].split("is")[1].trim();
		
		String Pass = pass.replaceAll("[)]", "");
		
		System.out.println(userName);
		
		System.out.println(Pass);
		
		driver.findElement(By.cssSelector("#username")).sendKeys(userName);
		driver.findElement(By.cssSelector("#password")).sendKeys(Pass);
		
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[@class='customradio'][2]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='modal-footer'] button[id='okayBtn']")));
		
		driver.findElement(By.cssSelector("div[class*='modal-footer'] button[id='okayBtn']")).click();
		
		WebElement dd = driver.findElement(By.cssSelector("select[data-style*='btn-info']"));
		
		Select sdd = new Select(dd);
		
		sdd.selectByVisibleText("Consultant");
		System.out.println(sdd.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("#terms")).click();
		
		driver.findElement(By.cssSelector("#signInBtn")).click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='nav-link btn btn-primary']")));
		
		List<WebElement> items = driver.findElements(By.cssSelector(".btn-info"));
		
		for(WebElement item : items) {
			
			item.click();
		}
		
		driver.findElement(By.cssSelector("a[class*='nav-link btn btn-primary']")).click();
		

	}

}
