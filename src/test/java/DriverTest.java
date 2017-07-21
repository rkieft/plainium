import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by richard on 18-7-17.
 */
public class DriverTest {

    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        DriverRegistry tempdriver = new DriverRegistry(Browsers.FIREFOX);
        driver = tempdriver.getDriver();
    }

    @Test
    public void test(){
        driver.get("http://www.google.nl");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
