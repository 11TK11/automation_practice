package ui.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.core.WebDriverManager;

public abstract class AbstractPage {
    protected WebDriver webDriver;

    protected AbstractPage(){
        webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver,this);
    }
}
