package org.smpc.sales_automation.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.smpc.sales_automation.base.BasePage;

public class DashboardPage extends BasePage {
    public DashboardPage(WindowsDriver driver) {
        super(driver);
    }
    // element
    private WebElement WelcomeLabel() {
        return byName("Layout");
    }
    private WebElement salesQuoteButton() {
        return byName("Sales Quotation");
    }
    private WebElement newSalesQuoteButton() {
        return  byName("btn_new");
    }

    // action
    public void gotoSalesQuote() {
        click(salesQuoteButton());
    }
    public void gotoNewSalesQuote() {
        click(newSalesQuoteButton());
    }
}
