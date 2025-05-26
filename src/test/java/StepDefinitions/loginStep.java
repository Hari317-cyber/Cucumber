package StepDefinitions;

import CommonDriver.DefaultDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjectModel.loginPOM;
public class loginStep {

    loginPOM login = new loginPOM(DefaultDriver.getDriver("chrome"));

    @Given("the user is in login page")
    public void the_user_is_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        https://www.automationexercise.com/login
        System.out.println("the user is in login page");
        this.logout();
        login.url();

    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user enters valid credentials");

        login.enterCreds("ajith@email.com","password-1");
    }
    @When("clicks submit button")
    public void clicks_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicks submit button");
        login.clickSubmit();
    }
    @Then("user logged in successfully")
    public void user_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user logged in successfully");
        login.verifyLoggedIn();
    }

    @Given("Navigate to url")
    public void navigate_to_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigate to url");
        login.url();

    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify that home page is visible successfully");
        login.verifyHomeText();
    }
    @When("Enter incorrect email address and password1")
    public void enter_incorrect_email_address_and_password1() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter incorrect email address and password1");
        login.enterCreds("ajith@email.com","123");
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Submit");
        login.clickSubmit();
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("verify error");
        login.verifyValidationMessage(string);
    }
    @Then("logout")
    public void logout() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("logout");

        login.logout();
    }

}
