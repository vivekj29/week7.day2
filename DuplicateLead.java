package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DuplicateLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "DuplicateLead";
	}

	@Test(dataProvider = "sendData")
	public void runDuplicateLead(String phno) throws InterruptedException {
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
		.clickDuplicateLead()
		.clickUpdateButton()
		.verifyFirstName();
	}

}

