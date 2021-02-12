package or;

import org.openqa.selenium.By;

public class CustomersPage {
	public static By lnktxtCustomers=By.xpath("//body/div[@id='adminAppMenu']/h3[@id='ui-accordion-adminAppMenu-header-2']/a[1]");
	public static By lnktxtCustomers1=By.xpath("//body/div[@id='adminAppMenu']/div[@id='ui-accordion-adminAppMenu-panel-2']/ul[1]/li[1]/a[1]");
	public static By lnktxtSelectCustomer=By.xpath("//td[contains(text(),'Beneventi')]");
	public static By btnEditCustomer=By.xpath("//span[contains(text(),'Edit')]");
	public static By txtCompName=By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
	public static By btnSave=By.xpath("//span[contains(text(),'Save')]");
	
	
}
