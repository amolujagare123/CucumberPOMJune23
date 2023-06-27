package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static stepdefinitions.SharedSD.getDriver;

public class SearchResultPage extends Base {


   /* WebDriver driver;
    By myLocator = By.xpath("");
    WebElement element  = driver.findElement(By.xpath(""));
    WebElement element2  = driver.findElement(myLocator);*/


    public void clickRating(String star)
    {
        By locator = By.xpath("//div[@data-filters-item='class:class="+star+"']");
        webAction(locator).click();
    }

    By ratingElementList = By.xpath("//div[contains(@aria-label,'out of')]");

    public ArrayList<Integer> getRatingList()
    {
        List<WebElement> wbList = getDriver().findElements(ratingElementList);

        ArrayList<Integer> ratingList = new ArrayList<>();

        for (int i=0;i<wbList.size();i++)
        {
            String temp = wbList.get(i).getAttribute("aria-label"); // "5 out of 5"
            String ratingStr = temp.split(" ")[0]; // "5"
            int rating = Integer.parseInt(ratingStr);
            ratingList.add(rating);
        }
        return ratingList;
    }

}
