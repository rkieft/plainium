package Elements.impl;

import Elements.CheckboxInterface;
import org.openqa.selenium.WebElement;

/**
 * Created by richard on 19-7-17.
 */
public class CheckBox extends WebElementImpl implements CheckboxInterface {

    public CheckBox(WebElement element) {
        super(element);
    }

    public void check() {
        if (!getWrappedElement().isSelected()){
            getWrappedElement().click();
        }
    }

    public void uncheck() {
        if (getWrappedElement().isSelected()){
            getWrappedElement().click();
        }
    }

    public boolean isChecked() {
        return getWrappedElement().isSelected();
    }
}
