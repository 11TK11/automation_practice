package ui.pageObjects.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.CommonActions;
import ui.pageObjects.AbstractPage;

import java.util.HashMap;
import java.util.Map;

public class LeftPanel extends AbstractPage {
    //TODO
    By shirtSize2 = By.xpath("//input[@value='XS']");

    //TODO
    @FindBy(xpath = "//span[text()='XS']")
    private WebElement shirtSize;

    //TODO
    @FindBy(xpath = "//span[@value='XS']")
    private WebElement nameField;

    @FindBy(xpath = "//div[@class='star-button-container']/p/small")
    private WebElement startComment;

    public String getStartComment() {
        Boolean isVisible = CommonActions.isElementDisplayed(startComment);
        String comment = CommonActions.getText(startComment);
        return comment;
    }

    public void clickShirtSize(String shirtSize){
        String sizeLocator = "//span[text()='"+shirtSize+"']";
        By shirtSize2 = By.xpath(sizeLocator);
        Boolean isVisible = CommonActions.isElementDisplayed(shirtSize2);
        CommonActions.clickInput(shirtSize2);
    }
    // temp
    public void navigateTo(String url){
        webDriver.get(url);
    }

    public void setName(String name){
        CommonActions.setText(nameField,name);
    }
    private void setSize(String size) {
        CommonActions.setText(nameField,size);
    }
    private void setBrand(String brand) {
        CommonActions.setText(nameField,brand);
    }

    //TODO
    public Map<String,IFormFields> getForm(Map<String,String> values){
        Map<String,IFormFields> form = new HashMap<>();
        form.put("name", () -> setName(values.get("name")));
        form.put("size", () -> setSize(values.get("size")));
        form.put("brand", () -> setBrand(values.get("brand")));
        return form;
    }
}
