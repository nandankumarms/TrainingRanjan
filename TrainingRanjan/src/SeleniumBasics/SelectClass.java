package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on books link
		driver.findElement(By.partialLinkText("Books")).click();
		
		//Identify the dropdown
		WebElement sortByDropdown = driver.findElement(By.id("products-orderby"));
		
		//Create an object 
		Select select=new Select(sortByDropdown);
		
		List<WebElement> elements=select.getOptions();
		
		System.out.println(elements.size());
		
		//Check the dropdown is single select or multiple select 
		System.out.println(select.isMultiple());
		
		//Select any option by using index
		//select.selectByIndex(3);
		
		//Select option by value
		//select.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		
		//Select option by Visible text
		select.selectByVisibleText("Created on");
		
		//driver.quit();
		
		
	}

}
