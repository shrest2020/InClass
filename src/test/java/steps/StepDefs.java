package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Page.LoginPage;
import Util.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefs {
	WebDriver driver;
	LoginPage login;

	@Before
	public void StartBrowser() {
		driver = BrowserFactory.init();
		login = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=login/");

	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) throws Throwable {
		login.enterUserName(username);
		login.enterPassword(password);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		login.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Dashboard- iBilling");
	}

	@Then("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		login.ClickBankAndCash();
	}

	@Then("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		login.AddAccount();
	}

	@Then("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitle,
			String description, String initialBalance, String accountNumber, String contactPerson, String phone,
			String internetBankingUrl) throws Throwable {
		login.Account_TITTLE(accountTitle);
		login.Account_DESC(description);
		login.Account_Balance(initialBalance);
		login.Account_Number(accountNumber);
		login.Contact_Person(contactPerson);
		login.Contact_Phone(phone);
		login.Bank_Url(internetBankingUrl);
		login.Submit_Button();
	}

	@Then("^User should be able to validate the account$")
	public void user_should_be_able_to_validate_the_account() throws Throwable {
	
		String c = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]")).getText();
		
		Assert.assertEquals("Account Created Successfully", c);
		
		login.Msg();
		//login.takeScreenshotAtEndOfTest(driver);
	

		

	}
//	@After
//	public void TearDown() {
//		driver.close();
//		driver.quit();
//	}
}
