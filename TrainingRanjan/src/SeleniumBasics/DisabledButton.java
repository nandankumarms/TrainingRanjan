package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//a[text()='jdk-8u381-linux-aarch64.rpm']")).click();
		
	je.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@class='download-file icn-lock']")));	
	}	
	
}
