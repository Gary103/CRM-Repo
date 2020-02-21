package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector(".text-center>h2");
	private By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	private By Create = By.linkText("Create");
	private By FirstName = By.xpath("//input[@id='event_first_name']");
	private By LastName = By.xpath("//input[@id='event_last_name']");
	private By PhoneNumber = By.xpath("//input[@id='event_mobile']");
	private By PropertySelection = By.xpath("//div[@id ='property_selection']/div[1]/div/a");
	private By PropertySelectionDropOne = By.xpath("//div[@id='select2-drop']/div/input");
	private By PropertyDropDownResult = By.xpath("//*[@id='select2-results-2']/li[2]");
	private By SourceType = By.xpath("//div[@id='source_type_id']");
	private By SourceTypeSelect = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	private By SourceTypeSelectDropDown = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	private By SourceTypeSelectDropDownTwo = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	private By CreateButton = By.xpath("//button[@id='save_btn']");

	public LandingPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getCreate() {
		return driver.findElement(Create);
	}

	public WebElement getFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement getLastName() {
		return driver.findElement(LastName);
	}

	public WebElement getPhoneNumber() {
		return driver.findElement(PhoneNumber);
	}

	public WebElement getPropertySelection() {
		return driver.findElement(PropertySelection);

	}

	public WebElement getPropertySelectionDropOne() {
		return driver.findElement(PropertySelectionDropOne);

	}

	public WebElement getPropertyDropDownResult() {
		return driver.findElement(PropertyDropDownResult);

	}

	public WebElement getSourceType() {
		return driver.findElement(SourceType);

	}

	public WebElement getSourceTypeSelect() {
		return driver.findElement(SourceTypeSelect);

	}

	public WebElement getSourceTypeSelectDropDown() {
		return driver.findElement(SourceTypeSelectDropDown);

	}

	public WebElement getSourceTypeSelectDropDownTwo() {
		return driver.findElement(SourceTypeSelectDropDownTwo);

	}

	public WebElement getCreateButton() {
		return driver.findElement(CreateButton);

	}

}
