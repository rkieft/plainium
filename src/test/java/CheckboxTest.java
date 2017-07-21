import Pages.TestPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by richard on 19-7-17.
 */
public class CheckboxTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new DriverRegistry(Browsers.FIREFOX).getDriver();
        driver.get("https://www.cs.tut.fi/~jkorpela/www/testel.html");
    }

    @Test
    public void testCheckBox() {
        TestPage page = new TestPage(driver);
        page.checkbox().isChecked();
    }
}
