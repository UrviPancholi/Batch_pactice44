	package common_Actions;

	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import baseUtils.Base_Utils;

	public class Business_Libraries extends Base_Utils {
		
		public static void exceuteKeywrods (String testName) {
			try {
				rowCount = xls.getRowCount("TestCases");
				for (rowNum = 2; rowNum <= rowCount; rowNum ++) {
					
					testCaseName = xls.getCellData("TestCases", "TestCaseID", rowNum);
					if (testName.equalsIgnoreCase(testCaseName)) {
						
						runmode = xls.getCellData("TestCases", "RunMode", rowNum);
						if (runmode.equalsIgnoreCase("Y")) {
							
							actionName = xls.getCellData("TestCases", "ActionName", rowNum);
							xpathValues = xls.getCellData("TestCases", "ObjectXpath", rowNum);
							testDatas = xls.getCellData("TestCases", "TestData", rowNum);
							
							if (actionName.equalsIgnoreCase("openBrowser"))
								result = openBrowser(testDatas);
							
							if (actionName.equalsIgnoreCase("navigateUrl"))
								result = navigateUrl(testDatas);
							
							if (actionName.equalsIgnoreCase("closeBrowser"))
								result = closeBrowser();
							
							if (actionName.equalsIgnoreCase("enterText"))
								result = enterText(xpathValues, testDatas);
							
							if (actionName.equalsIgnoreCase("clickButton"))
								result = clickButton(xpathValues);
							
							if (actionName.equalsIgnoreCase("selectItem"))
								result = selectItem(xpathValues, testDatas);
						
							if (actionName.equalsIgnoreCase("verifyElement"))
								result = verifyElement(xpathValues);
						}
						xls.setCellData("TestCases", "Results", rowNum, result);
					}
				}
			}catch (Exception h) {
				h.printStackTrace();
			}
		}
	
	//opening a browser
	public static String openBrowser (String Browser) {
		try {
			if (Browser.equalsIgnoreCase("Chrome")) {
				// System.setProperty("webdriver.chrom.driver", "C:\\Users\\UPan1\\eclipse-workspace\\Selenium_Project\\Config_Drivers//chromedriver_win32.zip.");
				System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ "//Config_Drivers//chromedriver_win32//chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (Browser.equalsIgnoreCase("ie")) {
				System.out.println("User is able to open a browser");
			} else {
				System.out.println("");
			}
				return "PASS";
		} catch (Exception one) {
			one.printStackTrace();
			return "FAIL";
	}
		}
		
	//launching a application
	public static String navigateUrl (String url) {			
		try {
			driver.manage().window().maximize();
			driver.get(url);
			return "PASS";
		}catch (Exception one) {
			one.printStackTrace();
			one.addSuppressed(one);
			return "FAIL";
		}		
	}
		
	//entering a value
	public static String enterText (String xpath, String value) {
		try {
			elemnt = driver.findElement(By.xpath(xpath));
			elemnt.sendKeys(value);
			return "PASS";
		} catch (Exception one) {
			one.printStackTrace();
			one.equals(one); 
			return "FAIL";
		}
	}
		
		//clicking a button
		public static String clickButton (String xpath) {
			try {
				elemnt = driver.findElement(By.xpath(xpath));
				elemnt.click();
				return "PASS";
			} catch (Exception one) {
				one.equals(one);
				return "FAIL";
			}
		}
		
		// selecting an item
		public static String selectItem (String xpath, String item) {
			try {
				elemnt = driver.findElement(By.xpath(xpath));
				Select sel = new Select(elemnt);
				sel.selectByVisibleText(item);
				return "PASS";
			} catch (Exception one) {
				one.addSuppressed(one);
				return "FAIL";
			}
		}
			
	// verify an element
	public static String verifyElement (String xpath) {
		try {
			elemnt = driver.findElement(By.xpath(xpath));
			String a = elemnt.getText();
			System.out.println(a);
			return "PASS";
		} catch (Exception one) {
			one.addSuppressed(one);
			return "FAIL";
		}
	}
		
		// close a browser
		public static String closeBrowser () {
			try {
				driver.close();
				driver.quit();
				return "PASS";
			} catch (Exception one) {
				one.addSuppressed(one);
				return "FAIL";
			}
		}
		
			
	}
		
		