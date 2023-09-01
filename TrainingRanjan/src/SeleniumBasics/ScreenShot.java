package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
						
		Thread.sleep(2000);
		File temp=screenshot.getScreenshotAs(OutputType.FILE);
		File  dest=new File("./Screenshots/screenshot.png");
		 
		 FileHandler.copy(temp, dest);
		 
		driver.quit();
	}
}
