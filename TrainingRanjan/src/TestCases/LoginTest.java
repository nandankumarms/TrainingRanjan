package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;

public class LoginTest {
	
	@Test
	public void login() {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		home.clickLoginLink();
		
		login.enterEmail("nandan@gmail.com");
		
		login.getPasswordTF().sendKeys("password");
		
	}

}
