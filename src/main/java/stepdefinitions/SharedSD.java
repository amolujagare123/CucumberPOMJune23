package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedSD {

    public static WebDriver driver;
    @Before
    public void openURL()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/searchresults.html?ss=Goa&ssne=Goa&ssne_untouched=Goa&label=gog235jc-1DCAEoggI46AdIM1gDaGyIAQGYATG4ARfIAQzYAQPoAQH4AQqIAgGoAgO4AqCxsZ0GwAIB0gIkYjlhNTBmNWEtZDEzMS00OGU5LTlkZGEtNTBiOTZkZWU1YTE42AIE4AIB&sid=3a835ee8169eab4b6a1c4a9772dcba43&aid=397594&lang=en-us&sb=1&src_elem=sb&src=searchresults&dest_id=4127&dest_type=region&checkin=2023-09-06&checkout=2023-09-07&group_adults=2&no_rooms=1&group_children=0");
    }

    @After
    public void closeBrowser()
    {
      //  driver.close();
    }

    public static WebDriver getDriver()
    {
        return  driver;
    }
}
