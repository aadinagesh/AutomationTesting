package reuse;

import org.openqa.selenium.WebDriver;

import commands.ActionDriver;
import config.StartBrowser;
import or.CustomersPage;
import or.HomePage;
import or.LoginPage;

public class BusinessFunctions {
	
	WebDriver driver;
	ActionDriver aDriver;
	
	public BusinessFunctions() {
		driver=StartBrowser.driver;
		aDriver=new ActionDriver();
	}

	public void login() throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Login to Application");
		aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
		  aDriver.type(LoginPage.txtUserName, "gcreddy", "UserName");
		  aDriver.type(LoginPage.txtPassword, "Temp@2020", "Password");
		  aDriver.click(LoginPage.btnLogin, "Login button");
	}

	public void editCustomer() throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Edit Customer");
		
		  aDriver.click(CustomersPage.lnktxtCustomers, "Customers link");
		  aDriver.click(CustomersPage.lnktxtCustomers1, "Customers link1");
		  aDriver.click(CustomersPage.lnktxtSelectCustomer, "Select a Customer");
		  aDriver.click(CustomersPage.btnEditCustomer, "Edit customer");
		  aDriver.type(CustomersPage.txtCompName, "Nokia", "company name");
		  aDriver.click(CustomersPage.btnSave, "Save button");
	}

	public void logout() throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Logout of Application");
		  aDriver.click(HomePage.btnLogout, "Logout button");
	}

}
