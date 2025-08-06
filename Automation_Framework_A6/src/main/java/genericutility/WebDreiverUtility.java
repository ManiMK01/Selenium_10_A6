package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Manikandan
 */
public class WebDreiverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method will full screen the window
	 * @param driver
	 */
	public void fullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	/**
	 * This method will move into the specified Element 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method will scroll the bar till the webElement which is selected
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * 
	 * @param element
	 * @param driver
	 */
	public void mouseHover(WebElement element, WebDriver driver) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param keys
	 */
	public void mouseHover(WebDriver driver, WebElement element, CharSequence keys ) {
		Actions act = new Actions(driver);
		act.sendKeys(element).perform();
	}
	/**
	 * This method will scroll based on X & Y co-ordinate
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scroll(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}
	/**
	 * This method will select the value in list box or dropdwon based on index value 
	 * @param element
	 * @param index
	 */
	public void selectDropDwon(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * This method will select the value in list box based on Attribute name "value"
	 * @param element
	 * @param value
	 */
	public void selectDropDwon(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * This method will select the value in list box based on visibleText which present in between open and close tag
	 * @param text
	 * @param element
	 */
	public void selectDropDwon(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will switch to frame by index value
	 * @param driver
	 * @param index
	 */
	public void SwitchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method will switch to frame by Attribute name "name or Id"
	 * @param driver
	 * @param nameOrId
	 */
	public void SwitchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * This method will switch to frame by WebElement
	 * @param driver
	 * @param element
	 */
	public void SwitchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method will switch to alert
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	/**
	 * This method will take a screenshot of the webPage
	 * @param driver
	 * @throws IOException
	 */
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jutil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+jutil.getRandomNumber()+"image.png");
		FileHandler.copy(temp, dest);
	}
	/**
	 * This method will switch to window and compare based on current url of the WebPage
	 * @param driver
	 * @param expUrl
	 */
	public void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.equals(expUrl)) {
				break;
			}
		}
	}
	/**
	 * This method will switch to window and compare based on Title of the WebPage
	 * @param expTitle
	 * @param driver
	 */
	public void switchToWindow(String expTitle, WebDriver driver) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();
			if(actTitle.equals(expTitle)) {
				break;
			}
		}
	}
	
	
	
}
