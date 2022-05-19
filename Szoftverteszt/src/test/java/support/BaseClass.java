package support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    @Before
    public void driverInit() {
        System.setProperty("webdriver.chrome.driver","D:/Egyetem/Szoftwareteszt/4.házi/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @After
    public void closeDriver() {
        if(driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
