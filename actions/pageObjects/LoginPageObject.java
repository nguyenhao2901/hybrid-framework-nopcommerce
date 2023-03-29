package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginButton() {
		waitForElementVisible(driver,LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver,LoginPageUI.LOGIN_BUTTON);
	}

	public String getEmailErrorMessage() {
		waitForElementVisible(driver,LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getTextElement(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
	}
	
	public String getUnsuccessfulErrorMessage() {
		waitForElementVisible(driver,LoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
		return getTextElement(driver, LoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
	}


	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver,LoginPageUI.EMAIL_TEXTBOX);	
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver,LoginPageUI.PASSWORD_TEXTBOX);	
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	
	

}
