package Sel_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.cssSelector("#selenium143")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[text()='Blog Stats']")).getText());
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.cssSelector("a[href*='newPopup']")).click();
		windows = driver.getWindowHandles();
		
		for(String windowId : windows) {
			
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals("New Window")) {
				System.out.println(driver.findElement(By.className("example")).getText());
			}
		}

	}

}
