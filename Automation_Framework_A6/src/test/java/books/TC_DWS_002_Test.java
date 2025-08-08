package books;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002_Test {
	@Test
	public void launch() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("I don't no", true);

	}

}

