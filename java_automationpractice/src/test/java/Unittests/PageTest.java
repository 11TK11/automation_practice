package Unittests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.core.WebDriverManager;
import ui.pageObjects.Home.LeftPanel;

public class PageTest {
    @Test
    public void initPageTest(){
        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
        String exp="https://react-shopping-cart-67954.firebaseapp.com/";
        LeftPanel leftPanel = new LeftPanel();
        leftPanel.navigateTo(exp);
        leftPanel.clickShirtSize();
    }
}
