package ui.core.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements AbstractBrowser {
    private WebDriver webDriver;
    public Chrome() {
        System.setProperty("webdriver.chrome.driver","thirdParty\\chromedriver.exe");
        webDriver=new ChromeDriver();
    }

    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
