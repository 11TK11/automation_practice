package ui.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public final class CommonActions {
    public static void click(WebElement element){
        WebDriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public static void clickInput(WebElement element){
        waitElement(element);
        element.click();
    }
    public static void clickInput(By by){
        WebDriverManager.getInstance().getWebDriver().findElement(by).click();
    }
    public static void setText(WebElement element, String text){
        waitElement(element);
        element.sendKeys(text);
    }

    public static String getAttribute(WebElement element, String attribute) {
        waitElement(element);

        return element.getAttribute(attribute);
    }

    public static String getText(WebElement element) {
        return element.getText();
    }

    public static void waitElement(WebElement element){
        WebDriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToElement(WebElement element){
        waitElement(element);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) WebDriverManager.getInstance().getWebDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }
    public static boolean isElementDisplayed(By by) {
        return WebDriverManager.getInstance().getWebDriver().findElement(by).isDisplayed();
    }
}
