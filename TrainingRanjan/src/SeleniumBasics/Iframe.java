package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/QSP-Trainer6/Downloads/iframe.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer",Keys.ENTER);
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Google")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
