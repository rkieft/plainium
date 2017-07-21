package Elements.impl;

import Elements.InputInterface;
import org.openqa.selenium.WebElement;

/**
 * Created by richard on 7-7-17.
 */
public class Input extends WebElementImpl implements InputInterface{

    public Input(WebElement element) {
        super(element);
    }

    public void click(){
        getWrappedElement().click();
    }

    public void sendKeys(String keys) {
        getWrappedElement().sendKeys(keys);
    }

    public void clearValue() {
        getWrappedElement().clear();
    }

    public String getValue() {
        return getWrappedElement().getText();
    }

    public boolean isVisible() {
        return getWrappedElement().isDisplayed();
    }
}
