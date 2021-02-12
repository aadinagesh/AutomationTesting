package scripts;

import java.util.Stack;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC03 extends StartBrowser{
	@Test
	  public void testLogin_Logout() throws Exception {
		  BusinessFunctions bfunctions = new BusinessFunctions();
		  bfunctions.login();
		  bfunctions.editCustomer();
		  bfunctions.logout();
	  }


}
