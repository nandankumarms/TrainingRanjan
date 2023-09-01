package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to url
		driver.get("file:///C:/Users/QSP-Trainer6/Downloads/demo.html");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		
		//Identify the dropdown
		WebElement cars = driver.findElement(By.id("multiple_cars"));
		
		//Create an object for Select class
		Select select=new Select(cars);
		
//		//Check is it multiple or single select
//		System.out.println(select.isMultiple());
//		
//		//Select one option
//		select.selectByIndex(3);
//		
//		select.selectByIndex(2);
//		select.selectByIndex(4);
//		Thread.sleep(2000);
//		//select.deselectByIndex(3);
//		
//		select.selectByValue("hda");
//		Thread.sleep(2000);
//	//	select.deselectByValue("hda");
//		
//		//select.deselectAll();
//		
//		List<WebElement> allOptionsSelected = select.getAllSelectedOptions();
//		
//		for(WebElement options:allOptionsSelected) {
//			System.out.println(options.getText());
//		}
		
		//System.out.println(select.getFirstSelectedOption().getText());
		
		
		 
		
		System.out.println(select.getWrappedElement().getText());
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
