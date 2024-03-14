package com.automation.tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import static org.openqa.selenium.logging.LogType.DRIVER;

public class TestBase {
    AppiumDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AttendancePage attendancePage;
    private final String url="http://automationpractice.com/index.php";

    @BeforeSuite
    void setEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "87.0.4280.88")
                        .put("URL", url)
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Properties properties = new Properties();

        capabilities.setCapability("platformName","android");
        capabilities.setCapability("deviceName","Pixel_4_API_31");
        capabilities.setCapability("AndroidVersion","12");
        capabilities.setCapability("app","C:\\Users\\Admin\\Downloads\\Engage-app.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,"false");
        capabilities.setCapability("autoGrantPermissions",true);
        capabilities.setCapability("enablePerformanceLogging", true);
        capabilities.setCapability("autoGrantPermissions",true);
        capabilities.setCapability("extendedDebugging", true);
        capabilities.setCapability("locationContextEnabled", true);
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("autoAcceptAlerts", false);
        //capabilities.setCapability(AndroidMobileCapabilityType.AUTO_WEBVIEW_TIMEOUT,true);
        //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //driver = new AndroidDriver(new URL(properties.getProperty("appiumServer")), capabilities);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        attendancePage = new AttendancePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        ((AndroidDriver) driver).closeApp();
    }


}
