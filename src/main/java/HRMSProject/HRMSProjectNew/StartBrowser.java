package HRMSProject.HRMSProjectNew;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author rakpr
 *
 */
public class StartBrowser {
	
	public static WebDriver driver;
	String method;
	ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	
	@BeforeTest
	public void generateReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/MyReport.html");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeMethod
	public void methodname(Method method) {
		parentTest = extent.createTest(method.getName());
	}
	
	
//	@Test
//	public void sampleBrowser() {
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//	}
	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
//		System.out.println("path :" +WebDriverManager.chromedriver().getDownloadedDriverPath());
//		System.out.println("Version :" +WebDriverManager.chromedriver().getDownloadedersion());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
		extent.flush();
	}
}
