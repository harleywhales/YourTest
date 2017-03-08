package Carrace.YourTest;

import org.openqa.selenium.WebDriver;

import Auto.Landing_page_int;
import Auto.Reg_page_int;
import cucumber.api.java.en.Then;

public class place_holder_reg implements Reg_page_int, Landing_page_int{
	
	WebDriver driver;
	Helper_class reg_page = new Helper_class();
			
	@Then("^I confirm \"([^\"]*)\" text_field has a place holder of \"([^\"]*)\"$")
	public void i_confirm_text_field_has_a_place_holder_of(String element_locator, String value) throws Throwable {
	   switch(element_locator){
	   case"Email Address":
		  reg_page.assert_text(Email_Text_Field, EMAIL_AD_LOCATOR, value);
		  break;
		  
	   case"username":
			  reg_page.assert_text(USERNAME_TEXT_FIELD_LOCATOR, USERNAME_LOCATOR, value);
			  break;
			  
	   case"password":
			  reg_page.assert_text(PASSWORD_TEXT_FIELD_LOCATOR, PASSWORD_LOCATOR,value);
			  break;
			  
	   case"Cornfirmpassword":
			  reg_page.assert_text(CONFIRM_PASSWORD_TEXT_FIELD_LOCATOR, CONFIRM_PASSWORD_LOCATOR,value);
			  break;
		  default:
	   }
	   
	   }
}
