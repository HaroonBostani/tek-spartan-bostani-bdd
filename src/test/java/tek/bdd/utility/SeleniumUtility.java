package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    public  WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator){
        return  getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    // Create a method to click on a given locator
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }

    public void sendText(By locator, String value) {
       waitForVisibility(locator).sendKeys(value);
    }

    //Create method for getting the Text of a locator
    public String getElementText(By locator) {
        return waitForVisibility(locator).getText();
    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }

}
