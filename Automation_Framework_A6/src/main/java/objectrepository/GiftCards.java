package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards {
	
	@FindBy(xpath = "//select[@name='products-orderby']")
	private WebElement productsDropDwon;
	
	public GiftCards(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductsDropDwon() {
		return productsDropDwon;
	}
	
	

}
