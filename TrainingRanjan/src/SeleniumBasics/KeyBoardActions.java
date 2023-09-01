package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("computer");
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		action.sendKeys(Keys.PAGE_UP).perform();
		
	}
}
