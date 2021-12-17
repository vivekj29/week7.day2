package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	public ViewLeadPage (ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public ViewLeadPage verifyFirstName() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	
	public EditLeadPage clickEditLead() {
		driver.findElement(By.linkText(prop.getProperty("ViewLeadPage.linkText.Edit"))).click();
		return new EditLeadPage(driver, prop);
	}
	
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText(prop.getProperty("ViewLeadPage.linkText.Duplicate"))).click();
		return new DuplicateLeadPage(driver, prop);
	}
	
	public MyLeadsPage clickDeleteLead() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver, prop);
	}
	
	public ViewLeadPage verifyCompanyName() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

}
