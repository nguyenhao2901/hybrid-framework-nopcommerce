package pageObjectTechpanda;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import techpandaPageUIs.RegisterPageUITechpanda;

public class RegisterPageObjectTechpanda extends BasePage {
	private WebDriver driver;

	public RegisterPageObjectTechpanda(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToFirstnameTextbox(String firstname) {
		waitForElementVisible(driver, RegisterPageUITechpanda.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUITechpanda.FIRST_NAME_TEXTBOX, firstname);
	}

	public void inputToLastnameTextbox(String lastname) {
		waitForElementVisible(driver, RegisterPageUITechpanda.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUITechpanda.LAST_NAME_TEXTBOX, lastname);

	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, RegisterPageUITechpanda.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUITechpanda.EMAIL_TEXTBOX, emailAddress);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUITechpanda.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUITechpanda.PASSWORD_TEXTBOX, password);

	}

	public void inputToConfirmPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUITechpanda.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUITechpanda.CONFIRM_PASSWORD_TEXTBOX, password);

	}

	public MyDashboardPageObjectTechpanda clickToRegisterButton() {
		waitForElementVisible(driver, RegisterPageUITechpanda.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUITechpanda.REGISTER_BUTTON);
		return new MyDashboardPageObjectTechpanda(driver);
	}

}
