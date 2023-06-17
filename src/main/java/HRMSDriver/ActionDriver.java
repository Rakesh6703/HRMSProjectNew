package HRMSDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import HRMSProject.HRMSProjectNew.StartBrowser;

/**
 * @author rakpr
 *
 */
public class ActionDriver {
	
	WebDriver driver;
	public ActionDriver() {
		driver = StartBrowser.driver;
		
	}
	
	public void navigateToApplication(String url) {
		try {
		driver.get(url);
		StartBrowser.childTest.pass("Navigated to application successfully");
		} catch (Exception e) {
		StartBrowser.childTest.fail("Unable to navigate to application");	
		}
	}
	
	//Click by index method
		public void clickbyindex(By locator, int num) throws Exception 
		{
			try{			
				driver.findElements(locator).get(num).click();
				System.out.println("Clicked on the field :"+locator);
			} 
			catch (RuntimeException localRuntimeException) 
			{
			System.out.println("Error in clicking the field:" + localRuntimeException.getMessage() + "Fail");
			}
		}

		//Click by id method
		public void clickbyid(By locator, String eleName) throws Exception 
		{
			try{
				driver.findElement(locator).click();
				StartBrowser.childTest.pass("Performed click action successfully on :"+eleName);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				StartBrowser.childTest.fail("Unable to perform click action on :"+eleName,
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			}
		}
		
		//SendKeys method
		public void settext(By locator, String text, String eleName) throws Exception 
		{
			try{
				driver.findElement(locator).sendKeys(text);
				StartBrowser.childTest.pass("Performed type in :"+eleName + " with data :" +text);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				StartBrowser.childTest.fail("Unable to perform type in :"+eleName + " with data :" +text,
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			}
		}
		
		//Get by text method
		public void gettext(By locator) throws Exception 
		{
			try{
				driver.findElement(locator).getText();
				System.out.println("Retreved the text :"+locator);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				
			System.out.println("Error in retreving the text:" + localRuntimeException.getMessage() + "Fail");
			}
		}
		
		//Select method for dropdown
		public void selectbyvisibletext(By locator, String text) throws Exception 
		{
			try{
				Select dropdown = new Select(driver.findElement(locator));
				dropdown.selectByVisibleText(text);
				//AppiumWebDriver.getDriver().findElements(locator).get(0).click();
				System.out.println("Selected visible text :"+locator);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				
			System.out.println("Error in selecting visible text:" + localRuntimeException.getMessage() + "Fail");
			}
		}
		
		//Clear text method from field
		public void cleartextfromfield(By locator) throws Exception 
		{
			try{
				driver.findElement(locator).clear();
				System.out.println("Cleared text :"+locator);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				
			System.out.println("Error in clearing text:" + localRuntimeException.getMessage() + "Fail");
			}
		}
		
		//Maximize Window method
		public void maximizewindow() throws Exception 
		{
			try{
				driver.manage().window().maximize();
				System.out.println("Maximized window");
			} 
			catch (RuntimeException localRuntimeException) 
			{
				
			System.out.println("Error in Maximizing window:" + localRuntimeException.getMessage() + "Fail");
			}
		}
		
		//List method for select days from calender
		public void selectfromlist(By locator, String dates) throws Exception 
		{
			try{
				List<WebElement> allDates = driver.findElements(locator);
				for(WebElement ele:allDates)
				{
					
					String date=ele.getText();			     
					if(date.equalsIgnoreCase(dates))
					{
						ele.click();
						break;
					}
				}
				System.out.println("Selected date :"+locator);
			} 
			catch (RuntimeException localRuntimeException) 
			{
				
			System.out.println("Error in selecting date:" + localRuntimeException.getMessage() + "Fail");
			}
		}

		
		public String screenShot() {
			return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64); 
		}
 
}
