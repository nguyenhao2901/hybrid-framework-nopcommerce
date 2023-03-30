package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	private WebDriver driver;

	public PageGeneratorManager(WebDriver driver) {
		this.driver = driver;
	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
		return new CustomerInfoPageObject(driver);
	}
}
