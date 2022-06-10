package ui.pageObjects.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.CommonActions;
import ui.pageObjects.AbstractPage;

public class MainHeader extends AbstractPage {
    @FindBy(id = "contact-link")
    private WebElement contactUs;

    public boolean isContactLink(){
        return CommonActions.isElementDisplayed(contactUs);
    }
    public String getContactText(){
        return CommonActions.getText(contactUs);
    }

    public Contact clickOnContactLink() {
        CommonActions.click(contactUs);
        return new Contact();
    }
}
