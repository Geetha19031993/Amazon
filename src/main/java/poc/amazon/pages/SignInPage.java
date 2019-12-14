package poc.amazon.pages;

import poc.amazon.api.base.ProjectSpecificMethods;

public class SignInPage extends ProjectSpecificMethods {

	public SignInPage verifyPage() {
		driver.findElementByXPath("(//i[@role='img'])[1]").isDisplayed();
		return this;
	}
	public SignInPage continueButton()
	{
		driver.findElementByXPath("//input[@type='submit']").click();
		return this;
	}
	public SignInPage verifyMessage(String string2)
	{
		String str1 = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		String str2 = string2;
		if (str1.equals(str2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		return this;
		
	}
}
