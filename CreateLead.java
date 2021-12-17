package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest(alwaysRun = true)
	public void setValues() {
		excelFileName = "CreateLead";
	}

	@Test(dataProvider = "sendData")
	public void runCreateLead(String companyname, String firstname, String lastname) {
		LoginPage lp = new LoginPage(driver, prop);
		
		lp.enterUserName(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLead()
		.verifyFirstName();
	}

}

