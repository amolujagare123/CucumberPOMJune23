package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesClassDemo {

    public static void main(String[] args) throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("Config/config.properties");

        // 2. create the object of properties class
        Properties prop = new Properties();

        // 3. load the properties object with FileInputStream object
        prop.load(fis);

        // 4. read / get the property value
        System.out.println("url using properties ="+prop.getProperty("url"));
        System.out.println("username using properties ="+prop.getProperty("username"));

        // Another method
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
        System.out.println("url using resource bundle="+resourceBundle.getString("url"));
        System.out.println("username using resource bundle="+resourceBundle.getString("username"));

    }
}
