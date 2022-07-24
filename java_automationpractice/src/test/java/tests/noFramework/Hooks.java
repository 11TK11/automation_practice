package tests.noFramework;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import ui.core.WebDriverManager;

public class Hooks {
    static WebDriver webDriver;
    @BeforeAll
    public static void initTests(){
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }
}
