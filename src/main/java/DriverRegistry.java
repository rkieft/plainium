import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by richard on 18-7-17.
 */
public class DriverRegistry {

    private WebDriver driver;

    public DriverRegistry(Browsers browser) {
        if(browser.equals(Browsers.FIREFOX)){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if(browser.equals(Browsers.CHROME)) {

        } else if(browser.equals(Browsers.IE)) {

        } else {
            throw new NotImplementedException("Browser not implemented yet.");
        }
    }

    public WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            //fallback when no driver is provided.
            return new DriverRegistry(Browsers.FIREFOX).getDriver();
        }
    }
}
