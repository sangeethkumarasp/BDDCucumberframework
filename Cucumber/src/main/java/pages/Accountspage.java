package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Accountspage {
	
	private WebDriver driver;
	
	private By accountsectionelements =By.xpath("//div[@class='row addresses-lists']/descendant::a/span");
	
	
	
	
	
	public Accountspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String accountpagetitle()
	{
		return driver.getTitle();
	}
	
	
	public int accountsectionscount()
	{
		
		 List<WebElement> e2=driver.findElements(accountsectionelements);
		int a=e2.size();
		
		return a;
	}
	
	public List<String> gettextaccountsselection()
	{
		List<WebElement> el=driver.findElements(accountsectionelements);
		List<String> Accounttext=new ArrayList<>();
		
		for(WebElement e:el)
		{
			System.out.println(e.getText());
			
			String value=e.getText();
			Accounttext.add(value);
			
			
		}
		
		return Accounttext;
	}

}
