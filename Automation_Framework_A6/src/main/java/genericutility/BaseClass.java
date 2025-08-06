package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	
	public static ExtentReports ereport;
	public static WebDriver driver;
	public static ExtentTest test;
	
	public JavaUtility jutil = new JavaUtility();
	public WebDreiverUtility wutil = new WebDreiverUtility();
	public FileUtility futil = new FileUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	@BeforeSuite
	public void reprotCnfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReport_"+jutil.getSystemTime()+".html");
		ereport = new ExtentReports();
		ereport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(futil.getFromProperties("url"));
		//String URL = futil.getFromProperties("url");
		//driver.get(URL);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp =new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(futil.getFromProperties("email"));
		lp.getPasswordTextField().sendKeys(futil.getFromProperties("password"));
		lp.getLoginButton().click();
		
	}
	
	@AfterSuite
	public void reportBackup() {
		ereport.flush();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.getLogoutLink().click();
	}

}
