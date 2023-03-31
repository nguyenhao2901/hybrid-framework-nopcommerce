package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.nopcommerce.admin.AdminDashboardPageObject;
import pageObjects.nopcommerce.admin.AdminLoginPageObject;
import pageObjects.nopcommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopcommerce.user.UserHomePageObject;
import pageObjects.nopcommerce.user.UserLoginPageObject;
import pageObjects.nopcommerce.user.UserRegisterPageObject;

public class PageGeneratorManager {
	private WebDriver driver;

	public PageGeneratorManager(WebDriver driver) {
		this.driver = driver;
	}

	public static UserHomePageObject getHomePage(WebDriver driver) {
		return new UserHomePageObject(driver);
	}

	public static UserRegisterPageObject getRegisterPage(WebDriver driver) {
		return new UserRegisterPageObject(driver);
	}

	public static UserLoginPageObject getLoginPage(WebDriver driver) {
		return new UserLoginPageObject(driver);
	}

	public static UserCustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {

		return new UserCustomerInfoPageObject(driver);
	}

	public static AdminLoginPageObject getAdminLoginPage(WebDriver driver) {
		return new AdminLoginPageObject(driver);

	}

	public static AdminDashboardPageObject getAdminDashboardPage(WebDriver driver) {
		return new AdminDashboardPageObject(driver);

	}
}
