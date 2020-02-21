package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	private By AdminTools = By.xpath("//div [@id ='admin_tools_div']/section/section/section/header/ul/li[2]/a");
	private By ManageUsers = By.xpath("//div [@id = 'manage_users']/section/div/div/section/section/div/div/a");
	
	private By AddAgentUser = (By.xpath("//a[@class='btn btn-sm btn-info addUser']"));
	
	private By AgentName = (By.id("addUserFirstName"));
	private By AgentLastName = (By.xpath("//input[@id='addUserLastName']"));
	private By AgentEmail = (By.xpath("//input[@id='addUserEmail']"));
	private By AgentPassword = (By.xpath("//input[@id='addUserPassword']"));
	private By AgentClick = By.cssSelector("#saveAddUserButton");
	private By SectionWait = By.xpath("//div [@id ='admin_tools_div']/section/section/section/header/ul/li[2]/a");

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getAdmintools() {
		return driver.findElement(AdminTools);
	}

	public WebElement getManageUsers() {
		return driver.findElement(ManageUsers);
	}

	public WebElement getAgentName() {
		return driver.findElement(AgentName);
	}

	public WebElement getAgentLastName() {
		return driver.findElement(AgentLastName);
	}

	public WebElement getAgentEmail() {
		return driver.findElement(AgentEmail);
	}

	public WebElement getAgentPassword() {
		return driver.findElement(AgentPassword);
	}

	public WebElement getAgentClick() {
		return driver.findElement(AgentClick);
	}

	public WebElement getSectionWait() {
		return driver.findElement(SectionWait);
	}

	public WebElement getAddAgentUser() {
		return driver.findElement(AddAgentUser);
	}


	}

