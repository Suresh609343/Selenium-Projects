import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); // {parent window, child window}
		
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		//String a = ;
		String userName = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();
		
		System.out.println(userName);
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(userName);
		

	}

}
