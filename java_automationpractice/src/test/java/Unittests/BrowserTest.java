package Unittests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.core.browsers.BrowserFactory;

public class BrowserTest {
    @Test
    public void testChrome(){
        WebDriver a =BrowserFactory.getBrowser("chrome");

        String exp="https://www.google.com/";
        a.get(exp);
        String url = a.getCurrentUrl();
        assert exp.contentEquals(url);
        a.close();
    }
    @Test
    public void testFirefox(){
        BrowserFactory browserFactory = new  BrowserFactory();
        WebDriver a =browserFactory.getBrowser("firefox");

        String exp="https://www.google.com/";
        a.get(exp);
        String url = a.getCurrentUrl();
        assert exp.contentEquals(url);
        a.close();
    }
}
