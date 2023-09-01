package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//To launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Navigate to website
		driver.get("https://flipkart.com/");
		
		
		
		WebElement mensLink=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		Actions action=new Actions(driver);
		
		//Move cursor to computers link
		action.moveToElement(mensLink).build().perform();
		
		//Click on any web element
		action.click(driver.findElement(By.xpath("//a[text()='Men Footwear']"))).perform();
		
	}

}
