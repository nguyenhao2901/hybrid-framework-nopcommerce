package reportConfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("file:enviromentConfig/${evn}.properties")
public interface Enviroment extends Config {
	@Key("App.Url")
	String url();

	@Key("App.User")
	String user();

	@Key("App.Password")
	String password();

	@Key("DB.Host")
	String dbHost();

	@Key("DB.User")
	String dbUser();

	@Key("DB.Pass")
	String dbPass();

}
