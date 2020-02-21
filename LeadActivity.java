package Anyone;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LeadsPage;
import pageObjects.LoginPage;
import resources.base;

//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class LeadActivity extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver initialized for Lead Activity");

		driver.get(prop.getProperty("url"));
	}

	
	@Test//@Test(dataProvider = "getData")
	public void leadCreation() throws InterruptedException {

		driver.get(prop.getProperty("url"));

		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("rohan.patil@anyonehome.com");
		lp.getPassword().sendKeys("@123");
		lp.getLogin().click();
		log.info(" Agent Logged in Successfully");
		LandingPage l = new LandingPage(driver);
		driver.manage().window().maximize();
		l.getCreate().click();
		l.getFirstName().sendKeys("Firtst");
		l.getLastName().sendKeys("LastTexst");
		l.getPhoneNumber().sendKeys("985224226");
		log.info(" Phone Enetered Successfully");
		l.getPropertySelection().click();
		l.getPropertySelectionDropOne().sendKeys("sitka");
		log.info(" Sitka Entered ");
		l.getPropertyDropDownResult().click();
		l.getSourceType().click();
		l.getSourceTypeSelect().sendKeys("mitch");
		Thread.sleep(2000);
		log.info(" Source Entered Mitch ");
		l.getSourceTypeSelectDropDown().sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		log.info(" Source Selected Down ");
		l.getSourceTypeSelectDropDownTwo().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		log.info(" Source Selected Entered ");
		Thread.sleep(2000);
		l.getCreateButton().click();
		log.info(" Lead Created Succeffully ");

	}

	

	/*@AfterTest
	public void teardown() {

		driver.close();
		driver = null;

	}
	*/
	/*@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[1][1];
		// 0th row
		//data[0][0] = "rohan.patil@anyonehome.com";
		//data[0][1] = "@123";
		data[0][0] = "LeadOnekvs";
		data[0][1] = "TestOnkevs";
		data[0][2] = "9595554274";
	
		
		//data[1][0] = "rohan.patil@anyonehome.com";
		//data[1][1] = "@123";
		//data[1][0] = "LeadTwvos";
		//data[1][1] = "Testtwovs";
		//data[1][2] = "9595551735";

		return data;

}*/
	
	/*@Test(dependsOnMethods= {"leadCreation",})
	public void leadLogEvent() 
	{
	
	driver.get(prop.getProperty("url"));
	
	
	LeadsPage lsp = new LeadsPage(driver);
	lsp.getLogEvent().click();
	lsp.getLogEventSelect().click();
	//lsp.getLogEventSelectSearch().sendKeys("Lease");
	lsp.getLogEventSelectSearch().sendKeys(Keys.ARROW_DOWN);
	lsp.getLogEventSelectSearch().sendKeys(Keys.ENTER);
	lsp.getLogEventSelectDate().click();
	
	
	
	

	

	

	

	
	}
	*/
}

