package poc.amazon.pages;

import poc.amazon.api.base.ProjectSpecificMethods;

public class AddtoCart extends ProjectSpecificMethods{
	public AddtoCart deliveryBy()
	{
		System.out.println(driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText());
		return this;
	}
	public AddtoCart addtoCart()
	{
		driver.findElementByXPath("//input[@title='Add to Shopping Cart']").click();
		return this;
		
	}
	public AddtoCart messageVerify()
	{
		driver.findElementByXPath("//div[@id='huc-v2-order-row-messages']").isDisplayed();
		return this;
	}
	public SignInPage proceedButton()
	{
		driver.findElementByXPath("//*[@id=\"hlb-ptc-btn-native\"]").click();
		return new SignInPage();
	}
	
}
