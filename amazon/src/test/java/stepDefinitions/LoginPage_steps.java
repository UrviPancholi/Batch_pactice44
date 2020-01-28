package stepDefinitions;

import cucumber.api.java.en.Given;
import pagewisePackage.Login_Page;

public class LoginPage_steps extends Login_Page{

	
	@Given ("^I want to launch application \"(.*)\" on \"(.*)\" browser$")
	public void launch_app (String url, String browser) throws Exception {
		launchApp(browser, url);
		//Thread.sleep(2000);
	}

	
	
}
