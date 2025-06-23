// File: utils/PropertyReader.java
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("extent.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
