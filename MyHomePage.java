package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{

	public MyHomePage (ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public MyLeadsPage ClickLeadsLink() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.linkText.Leads"))).click();
		return new MyLeadsPage(driver, prop);
	}
}
