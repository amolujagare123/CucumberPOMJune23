package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AddCustomer;
import pages.Dashboard;
import pages.Login;

import static stepdefinitions.SharedSD.driver;

public class AddCustomerSD2 {

    /*    @Given("user is logged in")
        public void userIsLoggedIn() {
            // Implement the logic to log in the user
        }*/

        AddCustomer addCustomer = new AddCustomer();
        Login login = new Login();
        Dashboard dashboard = new Dashboard();

        @Given("stock user url is opened")
        public void stockUserUrlIsOpened() {
            // Implement the logic to open the stock user URL

        }

        @Given("user does login")
        public void userDoesLogin() {
                login.doLogin("admin",
                        "admin");
        }

        @Given("user is on add customer page")
        public void userIsOnAddCustomerPage() {
          dashboard.clickAddCustomer();
        }

        @When("^user adds (.+),(.+),(.+),(.+)$")
        public void userAddsCustomer(String name, String address, String contact1, String contact2) {
            // Implement the logic to add a customer with the provided details
                addCustomer.setName(name);
                addCustomer.setAddress(address);
                addCustomer.setContact1(contact1);
                addCustomer.setContact2(contact2);
                addCustomer.clickAdd();
        }

        @Then("user should be added successfully")
        public void userShouldBeAddedSuccessfully() {

                String expected = "Customer Details Added";
                String actual = "";
                try {
                         actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();

                }
                catch (Exception e)
                {

                }
                 boolean result = actual.contains(expected);
                Assert.assertTrue("Customer already exists",result);
        }
    }


