package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

/**
 * Created by richard on 10-7-17.
 */
public interface Element extends WebElement, WrapsElement, Locatable {
    boolean elementWired();
}
