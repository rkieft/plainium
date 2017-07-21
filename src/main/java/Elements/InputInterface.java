package Elements;

/**
 * Created by richard on 20-7-17.
 */
public interface InputInterface {

    void click();
    void sendKeys(String keys);
    boolean isVisible();
    void clearValue();
    String getValue();


}
