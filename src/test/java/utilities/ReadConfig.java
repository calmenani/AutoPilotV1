package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties configs;

    public ReadConfig() {
        File src = new File("./Configuration/Config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            configs = new Properties();
            configs.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        return configs.getProperty("appURL");
    }
    public String getUsername() {
        return configs.getProperty("username");
    }
    public String getPassword() {
        return configs.getProperty("password");
    }
    public String getChromeDriverPath() {
        return configs.getProperty("chromepath");
    }
    public String getFirefoxDriverPath() {
        return configs.getProperty("firefoxpath");
    }
    public String getIEDriverPath() {
        return configs.getProperty("iepath");
    }
}
