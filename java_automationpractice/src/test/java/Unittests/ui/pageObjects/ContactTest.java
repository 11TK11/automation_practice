package Unittests.ui.pageObjects;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.core.WebDriverManager;
import ui.pageObjects.Home.LeftPanel;
import ui.pageObjects.header.Contact;
import utils.Enums.ContactFields;

import java.util.HashMap;
import java.util.Map;

public class ContactTest {
    LeftPanel leftPanel= new LeftPanel();
    static WebDriver webDriver;
    @BeforeAll
    public static void  initTests(){
        webDriver = WebDriverManager.getInstance().getWebDriver();
        String exp="http://automationpractice.com/index.php?controller=contact";
        webDriver.get(exp);
    }
    @Test
    public void fillMessageTest(){
        Contact contact = new Contact();
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put(ContactFields.SUBJECT_HEADING.name(),"Webmaster");
        contactInfo.put(ContactFields.EMAIL_ADDRESS.name(),"asas@as.asa");
        contactInfo.put(ContactFields.ORDER_REFERENCE.name(),"asfasfafs");
        contactInfo.put(ContactFields.MESSAGE.name(), "asfasfasf");

        contactInfo.keySet().forEach(field -> contact.setContactForm(contactInfo).get(field).Fill());
        /*for(Map<String, String> expInfo:exp.entrySet()){
            Assertions.assertEquals(expInfo.getValue(),actualInfo.get(expInfo.getKey()));
        }*/
    }
}
