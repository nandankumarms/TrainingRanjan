package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement hideButton=driver.findElement(By.id("hide-textbox"));
		WebElement showButton=driver.findElement(By.id("show-textbox"));

		WebElement hiddenTextField=driver.findElement(By.id("displayed-text"));
		je.executeScript("window.scrollBy(0,300);");
		
		Thread.sleep(2000);
		hideButton.click();
		Thread.sleep(2000);
		je.executeScript("arguments[0].value='Ranjankumar';",hiddenTextField);
		Thread.sleep(2000);
		showButton.click();
		
	}
}
