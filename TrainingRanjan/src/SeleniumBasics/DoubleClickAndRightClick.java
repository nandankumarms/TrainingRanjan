package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(driver);
		
		//action.doubleClick(driver.findElement(By.xpath("//button"))).perform();
		
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
	}

}
