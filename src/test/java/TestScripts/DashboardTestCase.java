/**
 * 
 */
package TestScripts;

import org.testng.annotations.Test;

import HRMSAppFunction.BusinessFunction;
import HRMSProject.HRMSProjectNew.StartBrowser;
import utility.Xls_Reader;

/**
 * @author rakpr
 *
 */
public class DashboardTestCase extends StartBrowser {

	public static BusinessFunction Bfun;
	public static Xls_Reader reader;
	
	  @Test
	  public void LoginHRMS() throws Exception {
		  Bfun = new BusinessFunction();
		  reader = new Xls_Reader("Testdata/Data.xlsx");
		  String uName = reader.getCellData("Sheet1", "UserName", 2);
		  String password = reader.getCellData("Sheet1", "Password", 2);
		  Bfun.gotoApplication();
		  Bfun.login(uName, password);
	  }
	  
	  @Test
	  public void LogoutHRMS() throws Exception {
		 Bfun = new BusinessFunction();
		 Bfun.logout();
	  }
}
