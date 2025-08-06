package computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.ComputersPage;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_022_Test extends BaseClass {
	
	@Test
	public void clickOnComputersDesktop() {
		
	HomePage hp = new HomePage(driver);
	wutil.mouseHover(driver, hp.getComputersLink());
	ComputersPage cp = new ComputersPage(driver);
	wutil.mouseHover(cp.getDisktopsLink(), driver);
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops", "Desktops page is not displayed");
	test.log(Status.PASS, "Desktops page is displayed");
	
	}

}
