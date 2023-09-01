package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions {

	@Test
	public void booksPage() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Soft assert
				SoftAssert sa=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.trice" );
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		//Hard Assert
	   // Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().equals("Book"), true);
		
	   
		sa.assertEquals(driver.findElement(By.xpath("//h1")).getText().equals("Book"), true);
		System.out.println("Test continued");
		driver.quit();
		sa.assertAll();
	}
}
