package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	WebElement source = driver.findElement(By.id("box3"));
	WebElement destination = driver.findElement(By.id("box103"));
	
//	//Click and hold
	Actions action=new Actions(driver);
	
	action.clickAndHold(source).perform();
	
	//action.moveToElement(destination).perform();
	Thread.sleep(2000);
	action.release(destination).perform();
	
	//Drag and drop
	
	//action.dragAndDrop(source, destination).perform();
	
				
	}

}
