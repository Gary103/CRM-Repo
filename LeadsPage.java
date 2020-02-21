package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadsPage {

	public WebDriver driver;

	private By LogEvent = By.xpath("//a[@id='log_contact_button']");
	private By ScheduleEvent = By.xpath("//a[@id='schedule_contact_button']");
	private By SendEmail = By.xpath("//a[@id='send_mail_button']");
	private By SendSMS = By.xpath("//a[@id='send_sms_button']");
	private By SendLockCode = By.partialLinkText("Send Lock Co");
	private By Merge = By.xpath("//a[@id='possible_btn']");
	private By LogEventSelect = By.xpath("//div[@id = 's2id_li_log_showing']");
	private By LogEventSelectSearch = By.xpath("//div[@id = 's2id_li_log_showing']/a");
	private By LogEventSelectDate = By.xpath("//input[@id='log_date']");
	
	
	

	public LeadsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogEvent() {
		return driver.findElement(LogEvent);
	}

	public WebElement getScheduleEvent() {
		return driver.findElement(ScheduleEvent);
	}

	public WebElement getSendEmail() {
		return driver.findElement(SendEmail);
	}

	public WebElement getSendSMS() {
		return driver.findElement(SendSMS);
	}

	public WebElement getSendLockCode() {
		return driver.findElement(SendLockCode);
	}

	public WebElement getMerge() {
		return driver.findElement(Merge);
	}

	public WebElement getLogEventSelect() {
		return driver.findElement(LogEventSelect);
	}

	public WebElement getLogEventSelectSearch() {
		return driver.findElement(LogEventSelectSearch);
	}
	public WebElement getLogEventSelectDate() {
		return driver.findElement(LogEventSelectDate);
	}

	
	
}
