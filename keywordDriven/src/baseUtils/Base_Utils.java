package baseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Xls_Reader.Xls_Reader;

public class Base_Utils {
	
	public static WebDriver driver;
	public static WebElement elemnt;
	public static Xls_Reader xls = new Xls_Reader (System.getProperty("user.dir") + "\\src\\configData\\ConfigTestData.xlsx");
	public static int rowCount;
	public static int rowNum;
	public static String testCaseName;
	public static String runmode;
	public static String actionName;
	public static String xpathValues;
	public static String testDatas;
	public static String result;

}
