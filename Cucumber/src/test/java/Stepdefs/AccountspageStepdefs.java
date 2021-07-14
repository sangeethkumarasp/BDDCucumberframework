package Stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.Accountspage;
import pages.Loginpage;

public class AccountspageStepdefs {
	private Accountspage Accountspage;
	private Loginpage loginp=new Loginpage(Driverfactory.getdriver());
	
	

@Given("User has already logged in to application")
public void user_has_already_logged_in_to_application(io.cucumber.datatable.DataTable dataTable) {
	
List<Map<String,String>>lmpa=dataTable.asMaps();
	
  String name=lmpa.get(0).get("username");
  String pwd=lmpa.get(0).get("password");
  Driverfactory.getdriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  Accountspage=loginp.dologin(name, pwd);
}

@Given("user is on the account page")
public void user_is_on_the_account_page() {

	
	Accountspage.accountpagetitle();
}

@Then("user gets account section page")
public void user_gets_account_section_page(io.cucumber.datatable.DataTable dataTable) {
	
	List<String>Featurefilelist=dataTable.asList();
	
	System.out.println("feature file list"+" "+Featurefilelist);
	
	
	List<String>actualtextvalue=Accountspage.gettextaccountsselection();
	System.out.println("Actual  list"+" "+actualtextvalue);
	
	Assert.assertTrue(Featurefilelist.containsAll(actualtextvalue));
	
	
	
	
	
	

}

@Then("account sections count should be {int}")
public void account_sections_count_should_be(Integer int1) {
	Assert.assertTrue((int1.equals(Accountspage.accountsectionscount())));

   
}


	
	
	
	

}
