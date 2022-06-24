package ui.pageObjects.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.CommonActions;
import ui.pageObjects.AbstractPage;
import ui.pageObjects.Home.IFormFields;
import utils.Enums.ContactFields;

import java.util.HashMap;
import java.util.Map;

public class Contact extends AbstractPage {
    @FindBy(id = "email")
    private WebElement emailTextBox;

    By subjectHeadingSelectBox = By.id("id_contact");

    @FindBy(id = "id_order")
    private WebElement orderReferenceTextBox;

    @FindBy(id = "message")
    private WebElement messageTextBox;

    private void setEmailAddress(String emailAddress) {
        CommonActions.setText(emailTextBox,emailAddress);
    }

    private void setSubjectHeading(String subjectHeading) {
        CommonActions.selectOption(subjectHeadingSelectBox, subjectHeading);
    }

    private void setOrderReference(String orderReference) {
        CommonActions.setText(orderReferenceTextBox, orderReference);
    }

    private void setMessage(String message) {
        CommonActions.setText(messageTextBox, message);
    }

    private String getEmailAddress() {
        return CommonActions.getText(emailTextBox);
    }

    private String getSubjectHeading() {
        return CommonActions.getText(subjectHeadingSelectBox);
    }

    private String getOrderReference() {
        return  CommonActions.getText(orderReferenceTextBox);
    }

    private String getMessage() {
        return CommonActions.getText(messageTextBox);
    }
    public Map<String, IFormFields> setContactForm(Map<String, String> contactInfo) {
        Map<String, IFormFields> form = new HashMap<>();
        form.put(ContactFields.SUBJECT_HEADING.name(),
                () -> setSubjectHeading(contactInfo.get(ContactFields.SUBJECT_HEADING.name())));
        form.put(ContactFields.EMAIL_ADDRESS.name(),
                () -> setEmailAddress(contactInfo.get(ContactFields.EMAIL_ADDRESS.name())));
        form.put(ContactFields.ORDER_REFERENCE.name(),
                () -> setOrderReference(contactInfo.get(ContactFields.ORDER_REFERENCE.name())));
        form.put(ContactFields.MESSAGE.name(),
                () -> setMessage(contactInfo.get(ContactFields.MESSAGE.name())));
        return form;
    }

    public Map<String, IFormFields> getContactForm(Map<String, String> contactInfo) {
        Map<String, IFormFields> form = new HashMap<>();
        form.put(ContactFields.SUBJECT_HEADING.name(),
                () -> getSubjectHeading());
        form.put(ContactFields.EMAIL_ADDRESS.name(),
                () -> getEmailAddress());
        form.put(ContactFields.ORDER_REFERENCE.name(),
                () -> getOrderReference());
        form.put(ContactFields.MESSAGE.name(),
                () -> getMessage());
        return form;
    }

    public boolean isContactUrlDisplayed(){
        String expectedUrl = "http://automationpractice.com/index.php?controller=contact";
        return expectedUrl.contentEquals(CommonActions.getCurrentUrl());
    }
}
