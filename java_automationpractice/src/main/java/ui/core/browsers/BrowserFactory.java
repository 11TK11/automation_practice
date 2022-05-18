package ui.core.browsers;

import com.google.common.base.Supplier;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class BrowserFactory {
    private static final Map<String, Supplier<AbstractBrowser>> browsers = new HashMap<String, Supplier<AbstractBrowser>>();
    static {
        browsers.put("chrome", Chrome::new);
        browsers.put("firefox", Firefox::new);
    }
    public static WebDriver getBrowser(String browserName){
        return browsers.getOrDefault(browserName, Chrome::new).get().getWebDriver();
    }
}
