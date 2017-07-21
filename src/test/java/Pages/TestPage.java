package Pages;

import Elements.impl.Input;
import Elements.impl.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by richard on 19-7-17.
 */
public class TestPage {

    WebDriver driver;

    public TestPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckBox checkbox() {
        return new CheckBox(driver.findElement(By.name("checkbox")));
    }

    public Input input() {
        return new Input(driver.findElement(By.name("")));
    }
}
