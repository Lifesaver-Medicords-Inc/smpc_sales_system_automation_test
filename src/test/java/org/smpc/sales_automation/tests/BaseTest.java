package org.smpc.sales_automation.tests;

import io.appium.java_client.windows.WindowsDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WindowsDriver driver;

    @BeforeClass
    public static void setUp() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "F:\\QAs-Folder\\workspace\\lifesaver-inc\\erp\\smpc_sales_system\\smpc_sales_system\\bin\\Debug\\smpc_sales_system.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDown() {
//        if(driver != null) {
//            driver.quit();
//            driver = null;
//        }
    }
}
