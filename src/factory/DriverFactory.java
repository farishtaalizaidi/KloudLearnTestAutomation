package factory;

import constants.WebDriverConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    public static WebDriver getDriver(WebDriverConstant driver) {
        String exePath = driver.toString();
        switch (driver) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", exePath);
                return new ChromeDriver();
        }
        return null;
    }
}
