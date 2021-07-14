package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driverfactory {
	
public WebDriver driver;


public static ThreadLocal<WebDriver>t1driver=new ThreadLocal<>();

/**
 * @author sangeeth
 * This method is used to initialize thread local driver on the basis on given browser
 * @param Browser 
 * @return this will return t1 driver
 *
 */

public WebDriver init_driver(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		t1driver.set(new ChromeDriver());
		
	}else if(browser.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		t1driver.set(new FirefoxDriver());
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		t1driver.set(new EdgeDriver());
	}
	else if(browser.equalsIgnoreCase("IE"))
		
			{
				WebDriverManager.iedriver().setup();
				t1driver.set(new InternetExplorerDriver());
				
			}
	else
	{
		System.out.println("Please pass the correct browser"+"  "+browser);
	}
	
	getdriver().manage().deleteAllCookies();
	getdriver().manage().window().maximize();
	return getdriver();
	
}


/**
 * @author sangeeth
 * This method is used to getdriver with threadlocal
 *
 */

public static synchronized WebDriver getdriver()
{
	
	return t1driver.get();
}

	

}
