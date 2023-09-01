package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		//driver.quit();
	}
}
