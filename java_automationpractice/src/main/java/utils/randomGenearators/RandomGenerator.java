package utils.randomGenearators;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {
    public static int getIntNumber(int numberSize){
        String number = RandomStringUtils.randomNumeric(numberSize);
        return (int)numberSize;
    }
    public static String getString(int stringSize, String stringType){
        String string = RandomStringUtils.randomAlphabetic(stringSize);
        return string;
    }
    public static String getEmail(int stringSize, String domain){
        String email = getString(stringSize, "lowercase");
        return email+"@"+domain;
    }
}
