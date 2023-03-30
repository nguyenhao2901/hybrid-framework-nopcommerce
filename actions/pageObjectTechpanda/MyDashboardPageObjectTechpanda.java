package pageObjectTechpanda;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import techpandaPageUIs.MyDashboardPageUITechpanda;

public class MyDashboardPageObjectTechpanda extends BasePage {
	private WebDriver driver;

	public MyDashboardPageObjectTechpanda(WebDriver driver) {
		this.driver = driver;
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, MyDashboardPageUITechpanda.REGISTER_SUCCESS_MESSAGE);
		return getTextElement(driver, MyDashboardPageUITechpanda.REGISTER_SUCCESS_MESSAGE);
	}

	public void clickAccountLink() {
		waitForElementVisible(driver, MyDashboardPageUITechpanda.ACCOUNT_LINK_HEADER);
		clickToElement(driver, MyDashboardPageUITechpanda.ACCOUNT_LINK_HEADER);

	}

	public HomePageObjectTechpanda clickLogoutLink() {
		waitForElementVisible(driver, MyDashboardPageUITechpanda.LOGOUT_LINK);
		clickToElement(driver, MyDashboardPageUITechpanda.LOGOUT_LINK);
		return new HomePageObjectTechpanda(driver);
	}

	public boolean isWellcomMessageContainText(String textValue) {
		waitForElementVisible(driver, MyDashboardPageUITechpanda.WELLCOM_MESSAGE);
		return getTextElement(driver, MyDashboardPageUITechpanda.WELLCOM_MESSAGE).contains(textValue);

	}

}
