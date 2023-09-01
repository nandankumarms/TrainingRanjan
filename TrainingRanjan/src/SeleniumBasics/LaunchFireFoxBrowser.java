package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Java installables/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Method to get the title of the web page
		String title=driver.getTitle();
		
		//To get the url of the current webpage .--> getCurrentUrl()
		String url=driver.getCurrentUrl();
		
		String pageSource=driver.getPageSource();
		
		System.out.println(pageSource);
		
		System.out.println(url);
		
		Thread.sleep(3000);
		
		System.out.println(title);
		
		driver.quit();
	}

}
