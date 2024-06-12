import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2_Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPass(driver);
		//getPass(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Suresh");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}

	public static String getPass(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		String passText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String pass1 = passText.split("'")[1];
		String mainpass = pass1.split("'")[0];
		return mainpass;
	}

}
