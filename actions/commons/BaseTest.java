package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	private WebDriver driver;
	String projectPath = System.getProperty("user.dir");
protected WebDriver getBrowserDriver(String browserName) {
	switch (browserName) {
	case "firefox":
		System.setProperty("webdriver.gecko.driver", projectPath+"\\browserDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
	case "chrome":
		System.setProperty("webdriver.chrome.driver", projectPath+"\\browserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
	case "edge":
		System.setProperty("webdriver.edge.driver", projectPath+"\\browserDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		break;

	default: throw new RuntimeException("Browser Name is invalid");
	}
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
}
}
