package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// Set system property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java installables\\chromedriver-win64 (1)\\chromedriver-win64/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.xpath("")).click();
		
		
		
		
		

	}

}
