package poc.amazon.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poc.amazon.api.base.ProjectSpecificMethods;
import poc.amazon.pages.SelectPage;

public class TC001_Search extends ProjectSpecificMethods {
	@BeforeTest
	public void rundata()
	{
		excelFileName="data";
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001()
	{
		new SelectPage()
   		.search("Samsung Galaxy M30")
   		.click()
   		.productPrize()
   		.searchClick()
   		.switchwindow()
   		.deliveryBy()
   		.addtoCart()
   		.proceedButton()
   		.verifyPage()
   		.continueButton()
		.verifyMessage("Enter your email or mobile phone number");
		
	}

	
	
	
}
