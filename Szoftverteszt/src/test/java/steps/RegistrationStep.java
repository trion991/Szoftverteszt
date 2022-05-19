package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BaseClass;
import support.UserCreator;
import support.WaiterClass;
import user.User;

public class RegistrationStep {

    public User user;
    public WebDriver driver;
    public WaiterClass wait;

    @FindBy(css = ".login")
    public WebElement signInButton;
    @FindBy(css = "#email_create")
    public WebElement emailAddress;
    @FindBy(css = "#SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(css = "[name='customer_firstname']")
    public WebElement firstName;
    @FindBy(css = "[name ='customer_lastname']")
    public WebElement lastName;
    @FindBy(css = "[name='passwd']")
    public WebElement password;
    @FindBy(css = "[name='address1']")
    public WebElement address;
    @FindBy(css = "[name='city']")
    public WebElement city;

    @FindBy(css = "#id_state [value='1']")
    public WebElement state;

    @FindBy(css = "#postcode")
    public WebElement postalCode;
    @FindBy(css = "#id_country")
    public WebElement country;
    @FindBy(css = "#phone_mobile")
    public WebElement mobilePhone;
    @FindBy(css = "#alias")
    public WebElement addressAlias;

    public RegistrationStep() {
        driver = BaseClass.getDriver();
        wait = new WaiterClass();
        PageFactory.initElements(driver, this);
    }

    public void createUser() {
        UserCreator userCreator = new UserCreator();
        this.user = userCreator.getUser();
    }

    public void navigateToPage() {
        BaseClass.getDriver().get("http://automationpractice.com/index.php");
        signInButton.click();
        wait.waitForElement(driver, emailAddress);
        emailAddress.sendKeys(this.user.getEmailAddress());
        createAccountButton.click();
        wait.waitForElement(driver, firstName);
    }

    public void fillEveryRegistrationField() {
        firstName.sendKeys(this.user.getFirstName());
        lastName.sendKeys(this.user.getLastName());
        password.sendKeys(this.user.getPassword());
        address.sendKeys(this.user.getAddress());
        city.sendKeys(this.user.getCity());
        state.click();
        postalCode.sendKeys(this.user.getPostalCode());
        mobilePhone.sendKeys(this.user.getMobilePhone());
        addressAlias.clear();
        addressAlias.sendKeys(this.user.getAddressAlias());
    }

    public void checkFieldValues() {
        Assert.assertEquals(firstName.getAttribute("value"), "Peter");
        Assert.assertEquals(lastName.getAttribute("value"), "Pelda");
        Assert.assertEquals(password.getAttribute("value"), "peldapwd");
        Assert.assertEquals(address.getAttribute("value"), "Felso Tisza-Part 23");
        Assert.assertEquals(city.getAttribute("value"), "Szeged");
        Assert.assertEquals(postalCode.getAttribute("value"), "6723");
        Assert.assertEquals(mobilePhone.getAttribute("value"), "1245662321");
        Assert.assertEquals(addressAlias.getAttribute("value"), "Ady ter 10");
    }
}
