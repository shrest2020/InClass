package Page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver; // driver declare
	}

//Element Libraby
	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGNIN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANK_CASH;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement ADD_ACCT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]")
	WebElement ACCT_TITTLE;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]")
	WebElement ACCT_DESC;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]")
	WebElement ACCT_BAL;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account_number\"]")
	WebElement ACCT_NUM;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]")
	WebElement ACCT_NAM;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]")
	WebElement ACCT_PHONE;
	@FindBy(how = How.XPATH, using = "//input[@id=\"ib_url\"]")
	WebElement ACCT_URL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_LOCATOR;
	// Interactive Methods

	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void enterCredentials(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("user" + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

	public void ClickBankAndCash() {
		BANK_CASH.click();

	}

	public void AddAccount() {
		ADD_ACCT.click();
	}

	public void Account_TITTLE(String accountTitle) {
		ACCT_TITTLE.sendKeys(accountTitle);
	}

	public void Account_DESC(String Desc) {
		ACCT_DESC.sendKeys(Desc);
	}

	public void Account_Balance(String Balance) {
		ACCT_BAL.sendKeys(Balance);
	}

	public void Account_Number(String Number) {
		ACCT_NUM.sendKeys(Number);
	}

	public void Contact_Person(String Name) {
		ACCT_NAM.sendKeys(Name);
	}

	public void Contact_Phone(String Phone) {
		ACCT_PHONE.sendKeys(Phone);
	}

	public void Bank_Url(String Url) {
		ACCT_URL.sendKeys(Url);
	}

	public void Submit_Button() {
		SUBMIT_LOCATOR.click();
	}

	public void Msg() throws InterruptedException {
		Thread.sleep(2000);
		String expectedMessage = "";
	
		String message = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]")).getText();
		System.out.println(message);
		Assert.assertEquals(expectedMessage,message);

	}

}
