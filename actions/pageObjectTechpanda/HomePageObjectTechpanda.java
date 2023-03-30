package pageObjectTechpanda;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import techpandaPageUIs.HomePageUITechpanda;

public class HomePageObjectTechpanda extends BasePage {
	private WebDriver driver;

	public HomePageObjectTechpanda(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAccountLinkHeader() {
		waitForElementVisible(driver, HomePageUITechpanda.ACCOUNT_LINK_HEADER);
		clickToElement(driver, HomePageUITechpanda.ACCOUNT_LINK_HEADER);
	}

	public LoginPageObjectTechpanda clickToMyAccountLinkHeader() {
		waitForElementVisible(driver, HomePageUITechpanda.MY_ACCOUNT_LINK_HEADER);
		clickToElement(driver, HomePageUITechpanda.MY_ACCOUNT_LINK_HEADER);
		return PageGeneratorManagerTechpanda.getLoginPage(driver);
	}

	public LoginPageObjectTechpanda clickToLoginLink() {
		waitForElementVisible(driver, HomePageUITechpanda.LOGIN_LINK);
		clickToElement(driver, HomePageUITechpanda.LOGIN_LINK);
		return new LoginPageObjectTechpanda(driver);

	}

}
