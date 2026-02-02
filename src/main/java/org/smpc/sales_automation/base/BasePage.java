package org.smpc.sales_automation.base;

import io.appium.java_client.windows.WindowsDriver;

public class BasePage {
    protected WindowsDriver driver;
    public BasePage(WindowsDriver driver) {
        this.driver = driver;
    }
}
