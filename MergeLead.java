package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "MergeLead";
	}

	@Test(dataProvider = "sendData")
	public void runMergeLead(String fromname, String toname) throws InterruptedException {
		LoginPage lp = new LoginPage(driver, prop);
		
		lp.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickMergeLeads()
		.fromLead(fromname)
		.toLead(toname)
		.clickMergeButton()
		.verifyFirstName();
	}

}

