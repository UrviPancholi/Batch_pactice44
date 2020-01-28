package stepDefinitions;

import cucumber.api.java.en.And;
import pagewisePackage.Home_Page;

public class HomePage_steps extends Home_Page {
	
	@And ("^I want to search for \"(.*)\" under \"(.*)\" department$")
	public void seach_items (String selectItemV, String searchItem) throws Exception {
		Thread.sleep(2000);
		searchIytem (searchItem, selectItemV);
		System.out.println("hi");
	}
}
