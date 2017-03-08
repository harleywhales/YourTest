package Carrace.YourTest;

import org.openqa.selenium.WebDriver;

import Auto.Landing_page_int;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class register implements Landing_page_int{
	
WebDriver driver;

Helper_class register_page = new Helper_class();

public register(){
	this.driver = Landing_main.driver;
}

	@Given("^I click \"([^\"]*)\" button$")
	public void i_click_button(String reg_click) throws Throwable {
	    switch(reg_click){
	    case"register":
	    	register_page.do_click(Register_Button);
	    	break;
	    	
	    case"register_on_the_form":
	    	register_page.do_click(register_on_the_form_button);
	    	break;
	    	
	    	default: 	
	    }
	}

	@Given("^I enter \"([^\"]*)\"$")
	public void i_enter(String reg_ent) throws Throwable {
	   switch(reg_ent){
	   case"Preffered_username":
		   register_page.send_text(Preffered_username_Textfield, WEG);
		   break;
	   case"Email address":
		   register_page.send_text(Email_Text_Field, WEG_email);
		   break;
	   case"password":
		   register_page.send_text(Password_textfield , WEG_password);
		   break;
	   case"Confirm Password":
		   register_page.send_text(confirm_Password_textfield, WEG_Password_confirm);
		   break;
	  
	   
	   }
	}

	

	@Then("^\"([^\"]*)\" is dispalyed$")
	public void is_dispalyed(String reg_asst) throws Throwable {

		switch(reg_asst){
		 case "Home":
				register_page.assert_text("Home");
				break;
		}
		
	}
	   
	}

