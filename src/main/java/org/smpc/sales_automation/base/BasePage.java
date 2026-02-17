package org.smpc.sales_automation.base;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
    protected WindowsDriver driver;

    public BasePage(WindowsDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }
    protected void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
    protected String getText(WebElement element) {
        return element.getText().trim();
    }
    protected WebElement byAccessibilityId(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        driver.findElementByAccessibilityId(id)
                )
        );
    }
    protected WebElement byName(String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        driver.findElementByName(name)
                )
        );
    }
}
