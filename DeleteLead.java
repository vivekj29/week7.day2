package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "DeleteLead";
	}

	@Test(dataProvider = "sendData")
	public void runDeleteLead(String phno) throws InterruptedException {
		LoginPage lp = new LoginPage(driver, prop);
		
		lp.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNum(phno)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDeleteLead();
	}

}

