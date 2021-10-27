package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(WikipediaArticle.HEADING).hasText(term)
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
}
