package RealTimePractices;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.Get the Number of links in the webpage
		//2.Get the Number of links in the footer section of the page
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int noofLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(noofLinks);
		System.out.println("Lower body Number of Links");
		System.out.println(driver.findElements(By.xpath("//table[@class='gf-t'] //a")).size());
		
		//3.Get the number of links present in the 1st section of the footer section
		
		WebElement firstFootsec = driver.findElement(By.xpath("//table[@class='gf-t'] //td[1]")); // Limiting the scope of WeebDriver into a Sub driver
		
		int sizeOffirstfootsec = firstFootsec.findElements(By.tagName("a")).size();
		System.out.println("Number of Links in the 1st footerSection : "+sizeOffirstfootsec);
		
		//4.Click on each link in the 1st footer section & check if every link is opening or not and the title of the windows
		
		for(int i = 1; i<sizeOffirstfootsec; i++) {
			
			//String clickon = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			firstFootsec.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);			
			
		}
		Thread.sleep(5000);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		/*for(String window : windows) {
			
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}*/
		

	}

}
