package Stepdefs;

import org.junit.Assert;

import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Loginpage;

public class Loginsteps {
	
	private Loginpage loginpag=new Loginpage(Driverfactory.getdriver());
	private String title;
	
	
	
@Given("user is on the login page")
public void user_is_on_the_login_page() {
	Driverfactory.getdriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	
	title=loginpag.loginpagetitle();
}

@Then("page title should be {string}")
public void page_title_should_be(String message) {
    Assert.assertTrue(title.contains(message));
 
	

}

@Then("forgot your password link to be Displayed")
public void forgot_your_password_link_to_be_displayed() {
	Assert.assertTrue(loginpag.forgotlinkdisplayed());
}




@When("user enters username {string}")
public void user_enters_username(String username) {
	loginpag.enterusername(username);
	
}

@When("user enters password {string}")
public void user_enters_password(String pwd) {
	loginpag.enterpassword(pwd);
}

@When("user clicks on Login button")
public void user_clicks_on_login_button() {
	loginpag.clickonlogin();
}

@Then("user gets title of the accountpage")
public void user_gets_title_of_the_accountpage() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("pagetitle should be {string}")
public void pagetitle_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	

}
