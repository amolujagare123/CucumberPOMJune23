package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import static stepdefinitions.SharedSD.driver;

public class AddCustomerSD {

    /*    @Given("user is logged in")
        public void userIsLoggedIn() {
            // Implement the logic to log in the user
        }*/

/*
        @Given("stock user url is opened")
        public void stockUserUrlIsOpened() {
            // Implement the logic to open the stock user URL

        }

        @Given("user does login")
        public void userDoesLogin() {
            // Implement the logic for the user to perform login
                driver.findElement(By.id("login-username")).sendKeys("admin");
                driver.findElement(By.id("login-password")).sendKeys("admin");
                driver.findElement(By.name("submit")).click();
        }

        @Given("user is on add customer page")
        public void userIsOnAddCustomerPage() {
            // Implement the logic to navigate the user to the add customer page
                driver.findElement(By.linkText("Add Customer")).click();
        }

        @When("^user adds (.+),(.+),(.+),(.+)$")
        public void userAddsCustomer(String name, String address, String contact1, String contact2) {
            // Implement the logic to add a customer with the provided details
                driver.findElement(By.name("name")).sendKeys(name);
                driver.findElement(By.name("address")).sendKeys(address);
                driver.findElement(By.name("contact1")).sendKeys(contact1);
                driver.findElement(By.name("contact2")).sendKeys(contact2);
        }

        @Then("user should be added successfully")
        public void userShouldBeAddedSuccessfully() {

                String expected = "Customer Details Added";
                String actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
                boolean result = actual.contains(expected);
                Assert.assertTrue("",result);
        }*/
    }


