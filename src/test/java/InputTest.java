
import Pages.TestPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by richard on 20-7-17.
 */
public class InputTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new DriverRegistry(Browsers.FIREFOX).getDriver();
        driver.get("https://www.cs.tut.fi/~jkorpela/www/testel.html");
    }

    @Test
    public void testInput() {
        TestPage page = new TestPage(driver);
        page.input().click();
        page.input().clearValue();
        page.input().sendKeys("Test Me!");
        String value = page.input().getValue();
        boolean visible = page.input().isVisible();
//        AssertThat(value,is("Test Me!"));
    }
}
