package GiftCards;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.ListenerUtility;
import genericutility.WebDreiverUtility;
import objectrepository.GiftCards;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_062_Test extends BaseClass {
	
	@Test
	public void selectProduct() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.getGiftCardsLink().click();
		WebDreiverUtility wp = new WebDreiverUtility();
		ExcelUtility ex = new ExcelUtility();
		GiftCards gf = new GiftCards(driver);
		wp.selectDropDwon(ex.getStringDataFromExcel("Sheet1", 4, 0), gf.getProductsDropDwon());
		Select sel = new Select(gf.getProductsDropDwon());
		Assert.assertEquals(sel.getFirstSelectedOption().getText(), "Price: Low to High", "In gift card page the selected product is not displayed");
		test.log(Status.PASS, "In gift card page the selected product is displayed");
	}

}
