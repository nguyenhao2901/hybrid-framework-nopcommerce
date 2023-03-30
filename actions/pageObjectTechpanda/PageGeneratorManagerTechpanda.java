package pageObjectTechpanda;

import org.openqa.selenium.WebDriver;



public class PageGeneratorManagerTechpanda {

	public static HomePageObjectTechpanda getHomePage(WebDriver driver) {
		return new HomePageObjectTechpanda(driver);
	}

	public static LoginPageObjectTechpanda getLoginPage(WebDriver driver) {
		return new LoginPageObjectTechpanda(driver);
	}

} 
