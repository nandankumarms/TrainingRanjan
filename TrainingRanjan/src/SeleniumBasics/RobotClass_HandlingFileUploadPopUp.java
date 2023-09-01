package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass_HandlingFileUploadPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.partialLinkText("Register")).click();
//		
//		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Robot robot=new Robot();
		
		robot.mouseMove(300, 100);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_B);
//		robot.keyPress(KeyEvent.VK_C);
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyPress(KeyEvent.VK_E);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
