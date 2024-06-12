package Demo_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cura_health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.cssSelector("#btn-make-appointment")).click();
		
		//String userName = driver.findElement(By.cssSelector("input[aria-describedby*='demo_username_label']")).getText();
		//String pass = driver.findElement(By.cssSelector("input[aria-describedby*='demo_password_label']")).getText();
		
//		System.out.println("UserName is :" +userName);
//		System.out.println("Password is :" +pass);
		
		driver.findElement(By.cssSelector("#txt-username")).sendKeys("John Doe");
		driver.findElement(By.cssSelector("#txt-password")).sendKeys("ThisIsNotAPassword");
		
		driver.findElement(By.cssSelector("#btn-login")).click();
		
		WebElement sdd = driver.findElement(By.cssSelector("#combo_facility"));
		Select dd = new Select(sdd);
		
		dd.selectByValue("Hongkong CURA Healthcare Center");
		
		driver.findElement(By.cssSelector(".checkbox-inline")).click();
		
		driver.findElement(By.xpath("//div[@class='col-sm-4'] //input[@value='Medicare']")).click();
		
		driver.findElement(By.cssSelector("#txt_visit_date")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='datepicker-orient-top']")));
		
		String aMonth = driver.findElement(By.className("datepicker-switch")).getText().split(" ")[0];
		String aYear = driver.findElement(By.className("datepicker-switch")).getText().split(" ")[1];
		
		while(!(aMonth.equals("August") && aYear.equals("2027"))) {
			
			driver.findElement(By.xpath("//tr/th[@class='next']")).click();
			aMonth = driver.findElement(By.className("datepicker-switch")).getText().split(" ")[0];
			aYear = driver.findElement(By.className("datepicker-switch")).getText().split(" ")[1];
		}
		driver.findElement(By.xpath("//tr/td[text()='10']")).click();

		driver.findElement(By.cssSelector("#txt_comment")).click();
		driver.findElement(By.cssSelector("#txt_comment")).sendKeys("Help");
		
		driver.findElement(By.cssSelector("#btn-book-appointment")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-12 text-center'] //p[@class='lead']")).getText());
		
		System.out.print(driver.findElement(By.xpath("//div[@class='col-xs-offset-2 col-xs-8'] //label[@for='facility']")).getText()+": ");
		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-offset-2 col-xs-8'] //p[@id='facility']")).getText());
		
		System.out.print(driver.findElement(By.xpath("//div[@class='col-xs-4'] //*[text()='Apply for hospital readmission']")).getText()+": ");
		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-8'] //*[text()='Yes']")).getText());
		
		System.out.print(driver.findElement(By.xpath("//div[@class='col-xs-4'] //*[text()='Healthcare Program']")).getText()+": ");
		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-8'] //*[text()='Medicare']")).getText());
		
//		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-4'] //*[text()='Visit Date']")).getText()+": ");
//		System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-8'] //*[text()='Visit Date']")).getText());
		
		driver.quit();
		
		

	}

}
