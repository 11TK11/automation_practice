package ui.core.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements AbstractBrowser{
    private WebDriver webDriver;
    public Firefox() {
        System.setProperty("webdriver.gecko.driver","thirdParty\\geckodriver.exe");
        webDriver=new FirefoxDriver();
    }
    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
