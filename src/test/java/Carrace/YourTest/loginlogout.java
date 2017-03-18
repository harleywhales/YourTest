package Carrace.YourTest;

import org.openqa.selenium.WebDriver;

import Auto.Landing_page_int;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginlogout implements Landing_page_int{
	WebDriver driver;
	
	Helper_class loginandout_page = new Helper_class();
	
	@Given("^am on the \"([^\"]*)\" page$")
	public void am_on_the_page(String text) throws Throwable {
	    switch(text){
	    case"Login":
	    	loginandout_page.assert_text("Login");
	    	break;
	    case"Home":
	    	loginandout_page.assert_text("Login");
	    	break;
	    	default:
	    }
	}
	
	@Given("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_my_as(String element0, String value0) throws Throwable {
			   switch(element0){
	   case"Username":
		   loginandout_page.send_text("usernamelogin", value0);
		   break;
	   case"Password":
		   loginandout_page.send_text("loginPassword", value0);
		   break;
		   default:
	   }
	}
	@When("^I click \"([^\"]*)\" link$")
	public void i_click_link(String element) throws Throwable {
		switch(element){
		case"logout":
			loginandout_page.do_click_using_xpath("html/body/div[1]/section[1]/div[2]/a[2]");
			break;
			default:
		}
	    
	}

}
