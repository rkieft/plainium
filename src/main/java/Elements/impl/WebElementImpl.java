package Elements.impl;

import Elements.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;

import java.util.List;

/**
 * Created by richard on 8-7-17.
 */
public class WebElementImpl implements Element {

    private final WebElement element;

    public WebElementImpl(final WebElement element) {
        this.element = element;
    }

    public void click() {
        element.click();
    }

    public void submit() {
        element.submit();
    }

    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys(charSequences);
    }

    public void clear() {
        element.clear();
    }

    public String getTagName() {
        return element.getTagName();
    }

    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

    public boolean isSelected() {
        return element.isSelected();
    }

    public boolean isEnabled() {
        return element.isEnabled();
    }

    public String getText() {
        return element.getText();
    }

    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    public Point getLocation() {
        return element.getLocation();
    }

    public Dimension getSize() {
        return element.getSize();
    }

    public Rectangle getRect() {
        return element.getRect();
    }

    public String getCssValue(String s) {
        return element.getCssValue(s);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return element.getScreenshotAs(outputType);
    }

    public boolean elementWired() {
        return elementWired();
    }

    public Coordinates getCoordinates() {
        return getCoordinates();
    }

    public WebElement getWrappedElement() {
        return getWrappedElement();
    }
}
