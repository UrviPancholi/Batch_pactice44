package pagewisePackage;

import common_Actions.Business_Libraries;

public class Home_Page extends Business_Libraries{
	
	public static String allDepartment_dropDown = "//select[@id='searchDropdownBox']";
	public static String search_textBox = "//input[@id='twotabsearchtextbox']";
	public static String magnifyingglass_btn = "//input[@value='Go']";
	public static String search_results = "//div[@class='sg-col-inner']/div/span[4]";

	//search for an item
	public static void searchIytem (String sleItem, String textValue) {
		try {
			selectItem(allDepartment_dropDown, sleItem);
			enterText(search_textBox, textValue);
			clickButton(magnifyingglass_btn);
			verifyElement(search_results);
		}catch (Exception g) {
			g.printStackTrace();
		}
	}
	
	
	
}
