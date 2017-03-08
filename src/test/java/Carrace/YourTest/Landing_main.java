package Carrace.YourTest;

import Auto.Landing_page_int;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Landing_main extends drivers implements Landing_page_int {

	
	Helper_class Homepage = new Helper_class();

	@Before
	public void set_test() {
		Homepage.browser_set_up();
	}

	@Given("^I launch the \"([^\"]*)\"$")
	public void i_launch_the(String url) throws Throwable {
		Homepage.launch_url();
	}

	@Then("^I see the \"([^\"]*)\" page displayed$")
	public void i_see_the_page_displayed(String text) throws Throwable {
		switch (text){
		case "Login":
			Homepage.assert_text("Login");
			break;
			
	//	case "Home":
		//	Homepage.assert_text("Home");
			
			default:
		}
	}

	@After
	public void close_browser() {
		Homepage.close_browser();
	}

}
