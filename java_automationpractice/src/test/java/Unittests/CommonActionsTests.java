package Unittests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.core.CommonActions;
import ui.core.WebDriverManager;

public class CommonActionsTests {
    @Test
    public void testClickButton(){
        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
        String exp="http://automationpractice.com/index.php";
        webDriver.get(exp);
        String sfHoverForce = "//a[@title=\"Women\"]";
        WebElement element = webDriver.findElement(By.xpath(sfHoverForce));
        String act= CommonActions.getAttribute(element,"title");
        String expt="Women";
        assert act.contentEquals(expt);
        webDriver.close();
    }
}
