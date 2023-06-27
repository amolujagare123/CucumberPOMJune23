package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchResultPage;

import java.util.ArrayList;

import static stepdefinitions.SharedSD.driver;
import static stepdefinitions.SharedSD.getDriver;

public class BookingsSD {

    SearchResultPage searchResultPage = new SearchResultPage();
    @Given("I am on default locations search result screen")
    public void iAmOnDefaultLocationsSearchResultScreen() {
        System.out.println("I am on default locations search result screen");

        String expected = "booking.com";
        String actual = getDriver().getCurrentUrl();

        Assert.assertTrue("This is not bookings page",actual.contains(expected));
     }


    @When("^I select option for stars as (.+)$")
    public void iSelectOptionForStarsAsStars(String star) // "5 stars"
    {
        System.out.println("Star="+star);

        // 5 , 4 ,3

        searchResultPage.clickRating(star.split(" ")[0]);
    }

    @Then("^I verify system displays only (.+) hotels on search result$")
    public void iVerifySystemDisplaysOnlyStarsHotelsOnSearchResult(String star) {
        System.out.println("Star="+star);

        getDriver().navigate().refresh();

        ArrayList<Integer> ratingList = searchResultPage.getRatingList();
        System.out.println(ratingList);
    }
}
