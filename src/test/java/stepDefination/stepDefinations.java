package stepDefination;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinations {
	
@Given("User are on the Netbanking landing page")
public void user_are_on_the_netbanking_landing_page() {
    System.out.println("Netbanking");
}
@When("User login into application with {string} and {string}")
public void user_login_into_application_with_and(String string, String string2) {
	System.out.println(string);
	System.out.println(string2);
}
@Then("Home Page is populated")
public void home_page_is_populated() {
	System.out.println("Home Page");
}
@Then("Cards are displayed is {string}")
public void cards_are_displayed_is(String string) {
	System.out.println(string);
}

@Given("User should navigate to chrome browser")
public void user_should_navigate_to_chrome_browser() {
    System.out.println("navigated to chrome browser");
    
}
@Given("User should navigate to URL {string}")
public void user_should_navigate_to_url(String string) {
    System.out.println(string);
}
@Given("Click on login button")
public void click_on_login_button() {
    System.out.println("Clicked on login button");
}
@When("User login into site with {string} and password {string}")
public void user_login_into_site_with_and_password(String string, String string2) {
	System.out.println(string);
	System.out.println(string2);
}

}
