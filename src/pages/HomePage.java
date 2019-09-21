package pages;

import base.BasePage;
import constants.CSSConstants;
import constants.URLConstants;
import constants.WebDriverConstant;
import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver(WebDriverConstant.CHROME);
        driver.get(URLConstants.HOME_PAGE);

        try{
            WebElement signInBtn = driver.findElement(new By.ByCssSelector(CSSConstants.SIGN_IN_BUTTON));
            signInBtn.click();

            WebElement registerBtn= driver.findElement(new By.ByCssSelector(CSSConstants.REGISTER_BUTTON));
            registerBtn.click();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
}
