package pageObjectTechpanda;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import techpandaPageUIs.LoginPageUITechpanda;

public class LoginPageObjectTechpanda extends BasePage {
	private WebDriver driver;

	public LoginPageObjectTechpanda(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObjectTechpanda clickToCreateAnAccountButton() {
		waitForElementVisible(driver, LoginPageUITechpanda.CREATE_AN_ACCOUNT_BUTTON);
		clickToElement(driver, LoginPageUITechpanda.CREATE_AN_ACCOUNT_BUTTON);
		return new RegisterPageObjectTechpanda(driver);
	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, LoginPageUITechpanda.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUITechpanda.EMAIL_TEXTBOX, emailAddress);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUITechpanda.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUITechpanda.PASSWORD_TEXTBOX, password);

	}

	public MyDashboardPageObjectTechpanda clickToLoginButton() {
		waitForElementVisible(driver, LoginPageUITechpanda.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUITechpanda.LOGIN_BUTTON);
		return new MyDashboardPageObjectTechpanda(driver);
	}

}
