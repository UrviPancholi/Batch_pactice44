package pagewisePackage;

import common_Actions.Business_Libraries;

public class Login_Page extends Business_Libraries {
	
	//launch application
	public static void launchApp (String Browser, String url) {
		try {
			openBrowser(Browser);
			navigateUrl(url);
		}catch (Exception h) {
			h.printStackTrace();
		}
	}
	
	//login to the application

}
