package HRMSProject.HRMSProjectNew;

import org.openqa.selenium.By;

/**
 * @author rakpr
 *
 */
public class Locator {
	
	    //Login
		public static By Username = By.name("txtUsername");
		public static By Password = By.name("txtPassword"); 
		public static By Login_Button = By.id("btnLogin");
		
		//Logout
		public static By Welcome = By.id("welcome");
		public static By Logout = By.xpath("//a[contains(text(),'Logout')]"); 
		
		//Admin Menu
		public static By ADMINMENU = By.id("menu_admin_viewAdminModule");
		
		//Admin Menu -> User Management
		public static By USERMANAGEMENT = By.id("menu_admin_UserManagement");
		public static By USERMANAGEMENTUSER = By.id("menu_admin_viewSystemUsers");
		
		//Admin Menu -> Job
		public By JOB = By.id("menu_admin_Job");
		public By JOBTITLE = By.id("menu_admin_viewJobTitleList");
		public By PAYGRADES = By.id("menu_admin_viewPayGrades");
		public By EMPLOYMENTSTATUS = By.id("menu_admin_employmentStatus");
		public By JOBCATEGORIES = By.id("menu_admin_jobCategory");
		public By WORKSHIFTS = By.id("menu_admin_workShift");
		
		//Admin -> Organization
		public By ORGANIZATION = By.id("menu_admin_Organization");
		public By GENERALINFORMATION = By.id("menu_admin_viewOrganizationGeneralInformation");
		public By LOCATIONS = By.id("menu_admin_viewLocations");
		public By STRUCTURE = By.id("menu_admin_viewCompanyStructure");
		
		//Admin Menu -> Qualifications
		public By QUALIFICATIONS = By.id("menu_admin_Qualifications");
		public By SKILLS = By.id("menu_admin_viewSkills");
		public By EDUCATION = By.id("menu_admin_viewEducation");
		public By LICENSES = By.id("menu_admin_viewLicenses");
		public By LANGUAGES = By.id("menu_admin_viewLanguages");
		public By MEMBERSHIPS = By.id("menu_admin_membership");
		
		//Admin Menu -> Nationalities
		public By NATIONALITIES = By.id("menu_admin_nationality");
		
		//Admin Menu -> Corporate Branding
		public By CORPORATEBRANDING = By.id("menu_admin_addTheme");
		
		//Admin Menu -> Configuration
		public By CONFIGURATION = By.id("menu_admin_Configuration");
		public By EMAILCONFIGURATION = By.id("menu_admin_listMailConfiguration");
		public By EMAILSUBSCRIPTIONS = By.id("menu_admin_viewEmailNotification");
		public By LOCALIZATION = By.id("menu_admin_localization");
		public By LANGUAGEPACKAGES = By.id("menu_admin_languagePackage");
		public By MODULES = By.id("menu_admin_viewModules");
		public By SOCIALMEDIAAUTHENTICATION = By.id("menu_admin_openIdProvider");
		public By REGISTEROAUTHCLIENT = By.id("menu_admin_registerOAuthClient");
		
		//PIM Menu
		public By PIM = By.id("menu_pim_viewPimModule");
		
		//PIM -> Configuration
		public By PIMCONFIGURATION = By.id("menu_pim_Configuration");
		public By POTIONALFIELD  = By.id("menu_pim_viewPimModule");
		public By CUSTOMFIELDS = By.id("menu_pim_listCustomFields");
		public By DATAIMPORT = By.id("menu_admin_pimCsvImport");
		public By REPORTINGMETHODS = By.id("menu_pim_viewReportingMethods");
		public By TERMINATIONREASONS = By.id("menu_pim_viewTerminationReasons");
		
		//PIM -> Employee List
		public By EMPLOYEELIST = By.id("menu_pim_viewEmployeeList");
		
		//PIM -> Add Employee
		public By ADDEMPLOYEE = By.id("menu_pim_addEmployee");
		
		//PIM -> Reports
		public By PIMREPORTS = By.id("menu_core_viewDefinedPredefinedReports");
		
		//Leave
		public By LEAVE = By.id("menu_leave_viewLeaveModule");
		
		//Leave -> Apply
		public By APPLYLEAVE = By.id("menu_leave_applyLeave");
		
		//Leave -> My Leave
		public By MYLEAVE = By.id("menu_leave_viewMyLeaveList");
		
		//Leave -> Entitlements
		public By ENTITLEMENTS = By.id("menu_leave_Entitlements");
		public By ADDENTITLEMENTS = By.id("menu_leave_addLeaveEntitlement");
		public By EMPLOYEEENTITLEMENTS = By.id("menu_leave_viewLeaveEntitlements");
		public By MYENTITLEMENTS = By.id("menu_leave_viewMyLeaveEntitlements");
		
		//Leave -> Reports
		public By LEAVEREPORTS = By.id("menu_leave_Reports");
		public By LEAVEENTITLEMENTSANDUSAGEREPORT = By.id("menu_leave_viewLeaveBalanceReport");
		public By MYLEAVEENTITLEMENTSANDUSAGEREPORT = By.id("menu_leave_viewMyLeaveBalanceReport");
		
		//Leave -> Configure
		public By LEAVECONFIGURE = By.id("menu_leave_Configure");
		public By LEAVETYPE = By.id("menu_leave_leaveTypeList");
		public By WORKWEEK = By.id("menu_leave_defineWorkWeek");
		public By HOLIDAYS = By.id("menu_leave_viewHolidayList");
		
		//Leave -> Leave List
		public By LEAVELIST = By.id("menu_leave_viewLeaveList");
		
		//Leave -> Assign Leave
		public By ASSIGNLEAVE = By.id("menu_leave_assignLeave");
		
		//Time
		public By TIME = By.id("menu_time_viewTimeModule");
		
		//Time -> Timesheets
		public By TIMESHEETS = By.id("menu_time_Timesheets");
		public By MYTIMESHEETS = By.id("menu_time_viewMyTimesheet");
		public By EMPLOYEETIMESHEETS = By.id("menu_time_viewEmployeeTimesheet");
		
		//Time -> Attendance
		public By ATTENDANCE = By.id("menu_attendance_Attendance");
		public By MYRECORDS = By.id("menu_attendance_viewMyAttendanceRecord");
		public By PUNCHINOUT = By.id("menu_attendance_punchIn");
		public By EMPLOYEERECORDS = By.id("menu_attendance_viewAttendanceRecord");
		public By ATTENDANCECONFIGURATION = By.id("menu_attendance_configure");
		
		//Time -> Reports
		public By TIMEREPORT = By.id("menu_time_Reports");
		public By PROJECTREPORTS = By.id("menu_time_displayProjectReportCriteria");
		public By EMPLOYEEREPORTS = By.id("menu_time_displayEmployeeReportCriteria");
		public By ATTENDANCESUMMARY = By.id("menu_time_displayAttendanceSummaryReportCriteria");
		
		//Time -> Project Info
		public By PROJECTINFO = By.id("menu_admin_ProjectInfo");
		public By TIMECUSTOMERS = By.id("menu_admin_viewCustomers");
		public By TIMEPROJECTS = By.id("menu_admin_viewProjects");


}
