package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BaseClass;
import support.WaiterClass;

public class ShoppingCartStep {

    public WebDriver driver;
    public RegistrationStep registrationStep;
    public WaiterClass wait;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tShirtButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedToCheckout;

    @FindBy(css = "#total_price")
    public WebElement totalPrice;

    public ShoppingCartStep() {
        driver = BaseClass.getDriver();
        wait = new WaiterClass();
        registrationStep = new RegistrationStep();
        PageFactory.initElements(driver, this);
    }

    public void navigateToShoppingPage() {
        driver.get("http://automationpractice.com/index.php");
        tShirtButton.click();
        wait.waitForElement(driver, addToCartButton);
    }

    public void addItemToShoppingCart() {
        addToCartButton.click();
        wait.waitForElement(driver, proceedToCheckout);
    }

    public void checkShoppingCart() {
        proceedToCheckout.click();
        wait.waitForElement(driver, totalPrice);
    }

}
