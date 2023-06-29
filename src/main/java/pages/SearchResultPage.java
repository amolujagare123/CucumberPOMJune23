package pages;

import org.openqa.selenium.By;
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


    By priceListRawElement = By.xpath("//span[@data-testid='price-and-discounted-price']");

    public ArrayList<Integer> getPriceList()
    {
        ArrayList<Integer> priceList = new ArrayList<>();

        ArrayList<String> priceListRaw = getElementTextList(priceListRawElement);
        System.out.println(priceListRaw); // ₹ 3,399
        for (int i=0;i<priceListRaw.size();i++)
        {
            String priceRaw = priceListRaw.get(i).split(" ")[1];  // 3,399
            String priceStr = priceRaw.replace(",", "");
            int price = Integer.parseInt(priceStr);
            priceList.add(price);
        }
        System.out.println(priceList);
        return priceList;
    }

    By hotelsListElement = By.xpath("//div[@data-testid='title']");

    public ArrayList<String> getHotelsList()
    {
        return getElementTextList(hotelsListElement);
    }

}
