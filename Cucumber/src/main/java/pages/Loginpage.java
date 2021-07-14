package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Stepdefs.AccountspageStepdefs;

public class Loginpage {
	
	
	private WebDriver driver;
	
	private By emaildid =By.id("email");
	
	private By password=By.id("passwd");
	private By submitbuuton=By.id("SubmitLogin");
	private By forgotlink=By.linkText("Forgot your password?");
	
//	@findby(id="SubmitLogin")
//	private Webelement submit;
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String loginpagetitle()
	{
		System.out.println("the title is "+"  "+driver.getTitle());
	return	driver.getTitle();
	}
	
	public boolean forgotlinkdisplayed()
	{
		
	return	driver.findElement(forgotlink).isDisplayed();
		
	}
	
	public void enterusername(String username)
	{
		driver.findElement(emaildid).sendKeys(username);
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonlogin()
	{
		driver.findElement(submitbuuton).click();
	}
	
	
	public Accountspage dologin(String username,String pwd)
	{
		driver.findElement(emaildid).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(submitbuuton).click();
		System.out.println("login is sucessfull for"+" "+username);
		
		return  new Accountspage(driver);
		
	}
	

}
