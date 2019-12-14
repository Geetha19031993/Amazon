package poc.amazon.api.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataLibrary;

public class ProjectSpecificMethods {

	public static ChromeDriver driver;
	public String excelFileName;
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return new DataLibrary().readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void openwindow() 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void closewindow()
	{
		driver.quit();
	}
}
