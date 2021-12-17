package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

		public ChromeDriver driver;

		public String excelFileName;
		
		public Properties prop;
		
		@DataProvider(indices=0)
		public String[][] sendData() throws IOException{
			ReadExcel re = new ReadExcel();
			String[][] readData = re.readData(excelFileName);
			
			return readData;
		}
		
		@Parameters("language")
		@BeforeMethod
		public void preCondition(String lang) throws IOException {
			
			if(lang.equals("english")) {
			FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
			prop = new Properties();
			prop.load(fis);
			} else if(lang.equals("french")) {
				FileInputStream fis = new FileInputStream("./src/main/resources/french.properties");
				prop = new Properties();
				prop.load(fis);
				}
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}

}
