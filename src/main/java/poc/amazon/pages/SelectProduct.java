package poc.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import poc.amazon.api.base.ProjectSpecificMethods;

public class SelectProduct extends ProjectSpecificMethods{
	public SelectProduct productPrize()
	{
		String str = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(str);
		return this;
	}
	public SelectProduct searchClick() {

		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		return this;
	}
	public AddtoCart switchwindow()
	{
		Set<String> switchwindow = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(switchwindow);
		driver.switchTo().window(windowsList.get(1));
		return new AddtoCart();
	}
	
}
