package tests.noFramework.views;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui.pageObjects.header.Contact;
import ui.pageObjects.header.MainHeader;

public class ContactView {
    private static MainHeader mainHeader;
    private Contact contact;
    @BeforeAll
    public static void initSuite(){
        mainHeader = new MainHeader();
    }

    @Test
    public void testVerifyCanNavigateToContactWhenUsingHeaderLink(){
        // verify link is available
        Assertions.assertTrue(mainHeader.isContactLink(), "contact is not visible");
        contact = mainHeader.clickOnContactLink();
        Assertions.assertTrue(contact.isContactUrlDisplayed());
    }
}
