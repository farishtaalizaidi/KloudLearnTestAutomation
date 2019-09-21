package pages;

import base.BasePage;
import constants.CSSConstants;
import constants.IdConstants;
import constants.URLConstants;
import constants.WebDriverConstant;
import factory.DriverFactory;
import model.RegistrationPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver(WebDriverConstant.CHROME);
        driver.get(URLConstants.HOME_PAGE);

        try{
            WebElement signInBtn = driver.findElement(new By.ByCssSelector(CSSConstants.SIGN_IN_BUTTON));
            signInBtn.click();

            Thread.sleep(2000);

            WebElement registerBtn = driver.findElement(new By.ByCssSelector(CSSConstants.REGISTER_BUTTON));
            registerBtn.click();
            Thread.sleep(2000);

            RegistrationPageElement email = new RegistrationPageElement(IdConstants.EMAIL, "farishta.ali.zaidi@gmail.com");
            RegistrationPageElement password = new RegistrationPageElement(IdConstants.PASSWORD, "12345678");
            RegistrationPageElement workspaceName = new RegistrationPageElement(IdConstants.WORKSPACE_NAME, "Kloud");
            RegistrationPageElement firstName = new RegistrationPageElement(IdConstants.FIRST_NAME, "Farishta");
            RegistrationPageElement lastName = new RegistrationPageElement(IdConstants.LAST_NAME, "Zaidi");

            ArrayList<RegistrationPageElement> elements = new ArrayList<>();
            elements.add(email);
            elements.add(password);
            elements.add(workspaceName);
            elements.add(firstName);
            elements.add(lastName);

            for (int i = 0; i < elements.size(); i++) {
                RegistrationPageElement e = elements.get(i);
                driver.findElement(new By.ById(e.getId())).sendKeys(e.getKeysToSend());
            }



            WebElement register= driver.findElement(new By.ByCssSelector(".ant-btn"));
            register.click();
            Thread.sleep(5000);
        }
        catch (NoSuchElementException | InterruptedException e){
            e.printStackTrace();
        }

        finally {
            driver.close();
        }
    }
}
