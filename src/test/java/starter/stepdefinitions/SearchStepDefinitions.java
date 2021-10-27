package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.navigate;
import starter.search.look;
import starter.search.data;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(navigate.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                look.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(data.HEADING).hasText(term)
        );
    }

    @Then("User should successfully login to the Web Portal")
    public void userShouldSuccessfullyLoginToTheWebPortal() {
    }

    @Given("User is in the Login Page")
    public void userIsInTheLoginPage() {
    }

    @When("User provides  Username and Password")
    public void userProvidesUsernameAndPassword() {
    }

    @When("User provides valid Username admin and Password admin")
    public void userProvidesValidUsernameAdminAndPasswordAdmin() {
    }

    @Then("User should landing to Dashboard Page")
    public void userShouldLandingToDashboardPage() {
    }

    @When("User provides invalid Username john and Password admin")
    public void userProvidesInvalidUsernameJohnAndPasswordAdmin() {
        
    }

    @Then("Error message should appear with text {string}")
    public void errorMessageShouldAppearWithText(String arg0) {
    }

    @Given("User is in the Logout Page")
    public void userIsInTheLogoutPage() {
    }
}
