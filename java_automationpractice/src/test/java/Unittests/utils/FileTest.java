package Unittests.utils;

import org.junit.jupiter.api.Test;
import utils.File;

import java.util.Properties;

public class FileTest {
    @Test
    public void testGetProperties(){
        File file = new File("config.properties");
        Properties properties = file.getProperties();
         String browser= properties.get("browser").toString();
         assert browser.contentEquals("chrome");
    }
}
