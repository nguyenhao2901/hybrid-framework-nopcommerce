package commons;

import java.io.File;

public class GlobalConstants {
	public static final String USER_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_URL = "https://admin-demo.nopcommerce.com/";
	public static final String UPLOAD_FILE_PATH = System.getProperty("user.dir") + File.separator + "uploadFiles"
			+ File.separator;
	public static final String ADMIN_URL_TECHPANDA = "http://live.techpanda.org/index.php/backendlogin/customer/";
	public static final String JQUERY_DYNAMIC_DATA_GRID_URL = "https://www.jqueryscript.net/demo/jQuery-Dynamic-Data-Grid-Plugin-appendGrid/";
	public static final String JQUERY_UPLOAD_FILE_URL = "https://blueimp.github.io/jQuery-File-Upload/";
	public static final String FACEBOOK_URL = "https://www.facebook.com/";
	public static final long LONG_TIMEOUT = 30;
	public static final long SHORT_TIMEOUT = 5;
	public static final String EXTENT_PATH = System.getProperty("user.dir") + File.separator + "ExtentReportV2"
			+ File.separator;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String JAVA_VERSION = System.getProperty("java.version");
	public static final String OS_NAME = System.getProperty("os.name").toLowerCase();
	public static final String ADMIN_URL_WP = "http://abubu.net/wp-admin/";
	public static final String BROWSER_STACK_USER_NAME = "nguynho_zgFbJr";
	public static final String BROWSER_STACK_AUTOMATE_KEY = "ABS4xdfNXGKNcvpovMEm";
	public static final String BROWSER_STACK_URL = "https://" + BROWSER_STACK_USER_NAME + ":"
			+ BROWSER_STACK_AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	public static final String SAUCELAB_USER_NAME = "oauth-haont2901-406cd";
	public static final String SAUCELAB_AUTOMATE_KEY = "a44dc79c-b580-4d8d-be2e-d08c7d970cac";
	public static final String SAUCELAB_URL = "https://" + SAUCELAB_USER_NAME + ":" + SAUCELAB_AUTOMATE_KEY
			+ "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

}
