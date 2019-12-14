package poc.amazon.pages;

import poc.amazon.api.base.ProjectSpecificMethods;

public class SelectPage extends ProjectSpecificMethods{

	public SelectPage search(String value)
	{
		driver.findElementByXPath("//input[@type='text']").sendKeys(value);
		return this;
		
	}
	public SelectProduct click()
	{
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		return new SelectProduct();
		
	}
	
}
