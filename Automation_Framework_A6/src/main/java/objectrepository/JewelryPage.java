package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	
	@FindBy(xpath = "//select[@name='products-orderby']")
	private WebElement productsLiskBox;
	
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductsLiskBox() {
		return productsLiskBox;
	}
	
	
}
