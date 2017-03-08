package Carrace.YourTest;

import org.openqa.selenium.WebDriver;

import Auto.Landing_page_int;
import cucumber.api.java.en.Given;

public class Efficient_Registration implements Landing_page_int{
	
	WebDriver driver;
	Helper_class Efficient_R_Page = new Helper_class();
	
	@Given("^I entered \"([^\"]*)\" as \"([^\"]*)\" in the text field$")
	public void i_entered_as_in_the_text_field(String element_locator, String value) throws Throwable {
	    
		switch (element_locator){
		case "Email address":
			Efficient_R_Page.send_text(Email_Text_Field, value);
			break;
		case "Preffered username":
			Efficient_R_Page.send_text(Preffered_username_Textfield, value);
			break;
		case "Password":
			Efficient_R_Page.send_text(Password_textfield, value);
			break;
		case "confirm password":
			Efficient_R_Page.send_text(confirm_Password_textfield, value);
			break;
			default:
		}
	}




}
