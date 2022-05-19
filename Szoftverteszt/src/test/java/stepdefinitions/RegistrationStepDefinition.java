package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.RegistrationStep;

public class RegistrationStepDefinition {

    public RegistrationStep registrationStep = new RegistrationStep();

    @Given("a new user")
    public void a_new_user() {
        registrationStep.createUser();
    }

    @And("user navigate to page")
    public void userNavigateToPage() {
        registrationStep.navigateToPage();
    }

    @When("user fills every registration fields")
    public void user_fills_every_registration_fields() {
        registrationStep.fillEveryRegistrationField();
    }

    @Then("the registration values are correct")
    public void the_registration_values_are_correct() {
        registrationStep.checkFieldValues();
    }


}
