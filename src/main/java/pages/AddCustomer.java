package pages;

import org.openqa.selenium.By;

public class AddCustomer extends Base {
    By name = By.xpath("//input[@id='name']");
    By address = By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']");
    By contact1 = By.xpath("//input[@id='buyingrate']");
    By contact2 = By.xpath("//input[@id='sellingrate']");
    By submit = By.xpath("//input[@name='Submit']");
    public void setName(String value)
    {
        setValue(name,value);
    }
    public void setAddress(String value)
    {
        setValue(address,value);
    }
    public void setContact1(String value)
    {
        setValue(contact1,value);
    }
    public void setContact2(String value)
    {
        setValue(contact2,value);
    }

    public void clickAdd()
    {
        clickOn(submit);
    }
}
