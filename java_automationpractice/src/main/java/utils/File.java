package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class File {
    Properties properties;
    public File(String fileName){
        readFile(fileName);
    }
    private void readFile(String fileName){
        properties = new Properties();
        try(InputStream inputStream = new FileInputStream(fileName)) {
            properties.load(inputStream);
        } catch (IOException exception) {
            // TODO:Log
            throw new FileException();
        }
    }
    public Properties getProperties() {
        return properties;
    }
}
