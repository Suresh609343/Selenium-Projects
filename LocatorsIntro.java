import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Suresh");
		driver.findElement(By.name("inputPassword")).sendKeys("cdofd");
		driver.findElement(By.className("signInBtn")).click();
		// Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suresh");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sk@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("skrapuka@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8919483051");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
