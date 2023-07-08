package stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.Account;

public class CreateAccount {
	
	@Steps
	Account account;
	@Given("user is on create an account page")
	public void user_is_on_create_an_account_page() {
		
		account.openApplication();
	   
	}
	@Given("user enters Organisation name")
	public void user_enters_organisation_name() {
		
	   account.orgname("WCGB");
	    
		
	}
	@Then("user enters Firstname")
	public void user_enters_firstname() {
		account.firstname("Rency");
	}
	@Then("user enters Lastname")
	public void user_enters_lastname() {
		account.lastname("Rodrigues");
	}
	@Then("user enters email")
	public void user_enters_email() {
		account.e_mail("rencyrods777@gmail.com");
	}
	
	@Then("user enters Phone number")
	public void user_enters_phone_number() {
		account.phone_num("6549874022");
	}
	@Then("user enters password")
	public void user_enters_password() {
		account.pwd("Abc@12345","Abc@12345");
	}
	@Then("user enters Confirm Password")
	public void user_enters_confirm_password() {
		
	}
	@Then("user select option from dropdown")
	public void user_select_option_from_dropdown() {
		account.options("Other");
	}
	@Then("user checks the checkbox button")
	public void user_checks_the_checkbox_button() {
		account.checkBox();
		}
	@Then("user clicks on save button")
	public void user_clicks_on_save_button() {
		account.save();
	}
	@Then("User should be able to create an account")
	public void user_should_be_able_to_create_an_account() {
		
	}
}
