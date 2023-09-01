package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.BooksPage;

public class HandlingDropDown {

	@Test
	public void drop() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		BooksPage books=new BooksPage(driver);
		Select select=new Select(books.getSortByDropDown());
		
		int size=select.getOptions().size();
		
		
		for(int i=0;i<size;i++) {
			books.selctSortByOptionByIndex(i);
		
		}
	}
}
