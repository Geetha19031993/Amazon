package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@type='text']").sendKeys("Samsung Galaxy M30");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		String str = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(str);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> switchwindow = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(switchwindow);
		driver.switchTo().window(windowsList.get(1));
		System.out.println(driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText());
		driver.findElementByXPath("//input[@title='Add to Shopping Cart']").click();
		driver.findElementByXPath("//div[@id='huc-v2-order-row-messages']").isDisplayed();
		driver.findElementByXPath("//*[@id=\"hlb-ptc-btn-native\"]").click();
		String title = driver.getTitle();
		driver.findElementByXPath("(//i[@role='img'])[1]").isDisplayed();
		driver.findElementByXPath("//input[@type='submit']").click();
		String str1 = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		String str2 = "Enter your email or mobile phone number";
		if (str1.equals(str2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		driver.quit();
		
		
		
	}
	

}
