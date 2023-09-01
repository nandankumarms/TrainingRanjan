package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigationMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Java installables\\\\chromedriver-win64 (1)\\\\chromedriver-win64/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize Browser window
		driver.manage().window().maximize();
		
		
		
		
	}

}
