package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "EditLead";
	}

	@Test(dataProvider = "sendData")
	public void runEditLead(String phno, String compname) throws InterruptedException {
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
		.clickEditLead()
		.updateCompanyName(compname)
		.clickUpdateButton()
		.verifyCompanyName();
	}

}

