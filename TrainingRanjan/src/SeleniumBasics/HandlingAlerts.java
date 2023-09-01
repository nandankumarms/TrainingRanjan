package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//Click on button
		driver.findElement(By.id("promptexample")).click();
		
		Thread.sleep(2000);
	
		//Display the alert text
		System.out.println(driver.switchTo().alert().getText());
		
		//Enter some text in alert text field
		driver.switchTo().alert().sendKeys("Ranjan kumar");
		
		//Switch to alert and click on okay button
		driver.switchTo().alert().accept();
		
		//Close the browser
		driver.quit();
	}

}
