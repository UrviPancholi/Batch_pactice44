	package common_Actions;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class Business_Libraries {
		
		public static WebDriver driver;
		public static WebElement elemnt;
	
		//opening a browser
		public static void openBrowser (String Browser) {
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
			
			} catch (Exception one) {
				one.printStackTrace();
				
			}
		}
		
		//launching a application
		public static void navigateUrl (String url) {			
			try {
				driver.manage().window().maximize();
				driver.get(url);
			}catch (Exception one) {
				
				one.printStackTrace();
				one.addSuppressed(one);
			}
			
		}
		
		//entering a value
		public static void enterText (String xpath, String value) {
			try {
				elemnt = driver.findElement(By.xpath(xpath));
				elemnt.sendKeys(value);
			} catch (Exception one) {
				one.printStackTrace();
				one.equals(one); 
			}
		}
		
		//clicking a button
		public static void clickButton (String xpath) {
			try {
				elemnt = driver.findElement(By.xpath(xpath));
				elemnt.click();
			} catch (Exception one) {
				one.equals(one);
				
				}
				}
		// selecting an item
		public static void selectItem (String xpath, String item) {
			try {
				elemnt = driver.findElement(By.xpath(xpath));
				Select sel = new Select(elemnt);
				sel.selectByVisibleText(item);
			} catch (Exception one) {
				one.addSuppressed(one); 
			}
		}
			
		// verify an element
		public static void verifyElement (String xpath) {
				try {
					elemnt = driver.findElement(By.xpath(xpath));
					String a = elemnt.getText();
					System.out.println(a);
				} catch (Exception one) {
				one.addSuppressed(one);
			}
		}
		
		// close a browser
		public static void closeBrowser () {
			try {
				driver.close();
				driver.quit();
			} catch (Exception one) {
				one.addSuppressed(one);
			}
		}
		
			
	}
		
		