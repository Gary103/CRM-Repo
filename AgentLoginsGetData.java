package Anyone;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class AgentLoginsGetData extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver Initialize for Agents Logins");

	}

	@Test(dataProvider = "getData")
	public void userProfileLogin(CharSequence email, CharSequence password, Object login) {

		// one is inheritance

		// creating object to that class and invoke methods of it

		driver.get(prop.getProperty("url"));
		// LandingPage l=new LandingPage(driver);
		// l.getLogin().click(); //driver.findElement(By.css()
		LoginPage lp = new LoginPage(driver);

		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);

		log.info("Title");
		lp.getLogin().click();
		log.info("Rohan Logged in Successfully");

	}

	@AfterTest
	public void teardown() {

		driver.close();
		log.info("Driver is Closed");
		driver = null;
		log.info("Driver is null now");

	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[3][3];
		// 0th row
		data[0][0] = "rohan.patil@anyonehome.com";
		data[0][1] = "@123";
		data[0][2] = "Text";
		// 1st row

		data[1][0] = "ganesh.lokhande@anyonehome.com";
		data[1][1] = "Talent_123!";
		data[1][2] = "Text";

		return data;

	}

}