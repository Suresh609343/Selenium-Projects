import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_activites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/google.com");
		Thread.sleep(1000);
		driver.navigate().to("https:/twitter.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
