package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/QSP-Trainer6/Downloads/MultipleWindow.html");
		
		driver.findElement(By.tagName("input")).click();
		
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		
		//System.out.println(parentWindow);
		
		Thread.sleep(3000);
		
		Set<String> childWindow = driver.getWindowHandles();
		
		//System.out.println(childWindow);
		
		childWindow.remove(parentWindow);
		
		//System.out.println(childWindow);
		
		driver.close();
		
//		for(String child:childWindow) {
//	    driver.switchTo().window(child);
//	    if(driver.getCurrentUrl().contains("olive")) {
//	    	driver.quit();
//	    	break;
//	    }
	    
	
		}
//		
//		driver.findElement(By.xpath("//span[@class='hamburger']")).click();
		
		//driver.quit();
		
	}


