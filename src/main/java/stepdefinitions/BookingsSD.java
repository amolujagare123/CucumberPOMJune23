package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchResultPage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        System.out.println("Star="+star); // 4 star

        getDriver().navigate().refresh();

        ArrayList<Integer> ratingList = searchResultPage.getRatingList();
        System.out.println(ratingList);

        int size = ratingList.size();
        int starValue = Integer.parseInt(star.split(" ")[0]);
        System.out.println("starValue="+starValue);

        int frequency = Collections.frequency(ratingList,starValue);

        System.out.println("size="+size);
        System.out.println("frequency="+frequency);

        boolean result = (size==frequency);

        Assert.assertTrue("all rating are not ->"+star,result);
    }

    @Then("I verify system displays all hotels within {string} amount")
    public void iVerifySystemDisplaysAllHotelsWithinAmount(String amountStr) {

        int amount = Integer.parseInt(amountStr); // 25000
        ArrayList<Integer> priceList = searchResultPage.getPriceList();
        ArrayList<Integer> greaterPrices = searchResultPage.getPriceList();
        boolean flag = true;
        for (int i=0;i< priceList.size();i++)
        {
            if(priceList.get(i)>amount) {
                flag = false;
                greaterPrices.add(priceList.get(i));
            }
        }

        Assert.assertTrue("Some prices are higher than "+amount
                +"\nhere are the greater price List\n"+greaterPrices,flag);
    }
}
