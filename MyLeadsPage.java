package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	public MyLeadsPage (ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.linkText.CreateLead"))).click();
		return new CreateLeadPage(driver, prop);
	}

	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.linkText.FindLeads"))).click();
		return new FindLeadsPage(driver, prop);
	}
	
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver, prop);
	}
	
}
