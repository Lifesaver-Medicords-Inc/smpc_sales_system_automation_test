package org.smpc.sales_automation.pages;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.smpc.sales_automation.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage(WindowsDriver driver) {
        super(driver);
    }

    // elements
    private WebElement loginButton() {
        return byAccessibilityId("btn_login");
    }

    // actions
    public void clickLogin() {
        click(loginButton());
    }
}
