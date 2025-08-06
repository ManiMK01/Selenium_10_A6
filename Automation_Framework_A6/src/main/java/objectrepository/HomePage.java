package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLiks;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getJewelryLiks() {
		return jewelryLiks;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	



}
