package Unittests.ui.pageObjects;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.core.WebDriverManager;
import ui.pageObjects.Home.LeftPanel;
import utils.Enums.ShirtSizes;

public class LeftPanelTest {
    LeftPanel leftPanel= new LeftPanel();
    static WebDriver webDriver;
    @BeforeAll
    public static void  initTests(){
        webDriver = WebDriverManager.getInstance().getWebDriver();
        String exp="https://react-shopping-cart-67954.firebaseapp.com/";
        webDriver.get(exp);
    }
    @Test
    public void getStartText(){
        String comment = leftPanel.getStartComment();
        String expMessage = "Leave a star on Github if this repository was useful :)";
        assert comment.contentEquals(expMessage);
    }
    @Test
    public void clickShirtSize(){
        leftPanel.clickShirtSize(ShirtSizes.M.name());
    }

    @AfterAll
    public static void tearDown(){
        webDriver.close();
    }
}
