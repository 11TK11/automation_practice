package ui.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.core.browsers.BrowserFactory;
import utils.File;

import java.time.Duration;
import java.util.Properties;

public class WebDriverManager {
    private static WebDriverManager instance = new WebDriverManager();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    private int TIME_OUT=30;
    private Duration TIME_OUT_DURATION=Duration.ofSeconds(TIME_OUT);

    public static WebDriverManager getInstance(){
        return instance;
    }
    private WebDriverManager(){
        File file = new File("config.properties");
        Properties properties = file.getProperties();
        String browser= properties.get("browser").toString();
        webDriver = BrowserFactory.getBrowser(browser);
        webDriver.manage().window().maximize();
        webDriverWait = new WebDriverWait(webDriver,TIME_OUT_DURATION);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
