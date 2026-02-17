package org.smpc.sales_automation.tests;

import org.smpc.sales_automation.pages.DashboardPage;
import org.smpc.sales_automation.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeClass()
    public void setUpPage() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }
    @Test
    public void testLogin() {
        loginPage.clickLogin();
        dashboardPage.gotoSalesQuote();
        dashboardPage.gotoNewSalesQuote();
    }
}