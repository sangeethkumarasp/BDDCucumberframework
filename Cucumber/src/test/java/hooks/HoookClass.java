package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigReader;

public class HoookClass {

	
	private Driverfactory diverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	private Properties prop;
	
	@Before(order=0)
	public void getproperty()
	{
		
		configreader=new ConfigReader();
		prop=configreader.init_prop();
		
	}
	
	
	@Before(order=1)
	public void launchbrowser()
	{
		String browsername=prop.getProperty("browser");
		diverfactory=new Driverfactory();
		driver=diverfactory.init_driver(browsername);
		
	}
	
	@After(order=0)
	public void quitbrowser()
	{
		driver.quit();
		
	}
	
	@After(order=1)
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenshotname=scenario.getName().replaceAll(" ", "_");
	byte[]Sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	
	scenario.attach(Sourcepath, "image/png", screenshotname);
		}
	}
	
	
	
	
	
}
