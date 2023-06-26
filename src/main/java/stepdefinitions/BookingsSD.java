package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingsSD {

    @Given("I am on default locations search result screen")
    public void iAmOnDefaultLocationsSearchResultScreen() {
        // Implementation for navigating to the default locations search result screen
    }

    @When("I select option for stars as {string}")
    public void iSelectOptionForStars(String stars) {
     }

    @Then("I verify system displays only {string} hotels on search result")
    public void iVerifySystemDisplaysOnlyHotelsOnSearchResult(String stars) {

    }
}
