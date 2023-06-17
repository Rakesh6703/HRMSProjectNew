package TestScripts;

import org.testng.annotations.Test;

import HRMSAppFunction.BusinessFunction;
import HRMSProject.HRMSProjectNew.StartBrowser;

public class LoginTestCase extends StartBrowser {
	
	public static BusinessFunction Bfun;
	
  @Test
  public void LoginHRMS() throws Exception {
	  Bfun = new BusinessFunction();
	  Bfun.gotoApplication();
	  Bfun.login();
  }
  
  @Test
  public void LogoutHRMS() throws Exception {
	 Bfun = new BusinessFunction();
	 Bfun.logout();
  }
}