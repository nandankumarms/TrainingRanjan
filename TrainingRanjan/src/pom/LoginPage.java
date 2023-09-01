package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}	
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	
	public void enterEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	

}
