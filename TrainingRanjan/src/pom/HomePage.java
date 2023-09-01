package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement cartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	
	
}
