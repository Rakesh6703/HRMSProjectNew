package HRMSAppFunction;

import org.openqa.selenium.WebDriver;

import HRMSDriver.ActionDriver;
import HRMSProject.HRMSProjectNew.Locator;
import HRMSProject.HRMSProjectNew.StartBrowser;
/**
 * @author rakpr
 *
 */
public class BusinessFunction {

	WebDriver driver;
	ActionDriver aDriver;
	public BusinessFunction() {
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public void gotoApplication() {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to HRMS");
		aDriver.navigateToApplication("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	public void login() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to HRMS");
		aDriver.settext(Locator.Username, "Admin", "Username field");
		aDriver.settext(Locator.Password, "admin123", "Password field");
		aDriver.clickbyid(Locator.Login_Button, "Login Button");
	}
	
	public void login(String uName, String password) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to HRMS");
		aDriver.settext(Locator.Username, uName, "Username field");
		aDriver.settext(Locator.Password, password, "Password field");
		aDriver.clickbyid(Locator.Login_Button, "Login Button");
	}	
	
	public void logout() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Logout from HRMS");
		aDriver.clickbyid(Locator.Welcome, "Welcome username");
		aDriver.clickbyid(Locator.Logout, "Logout option");
	}
}
