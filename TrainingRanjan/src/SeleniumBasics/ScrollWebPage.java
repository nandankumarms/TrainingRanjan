package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.getPageSource());

//		JavascriptExecutor je = (JavascriptExecutor) driver;
//
////		// Scroll window by using some pixel value
////		je.executeScript("window.scrollBy(0,5000);");
////		Thread.sleep(3000);
////		je.executeScript("window.scrollBy(0,5000);");
////		je.executeScript("window.scrollBy(0,200);");
////
////		// Scroll to some particular pixel value
////		je.executeScript("window.scrollTo(0, -5000)");
//		
//		
//		WebElement zomatoImage = driver.findElement(By.xpath("//img[@alt='get-zomato-app']"));
//
//		WebElement text=driver.findElement(By.xpath("//p[text()='Explore options near me']"));
//		
//		//je.executeScript("arguments[0].scrollIntoView(false);",zomatoImage);
//		
//		je.executeScript("arguments[0].scrollIntoView(false);",text,zomatoImage);
//		
//		Thread.sleep(3000);
//		//driver.quit();
	}
}
