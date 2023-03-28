package org.appiumproject;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.*;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {

        //code to start the appium server
        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\shiva\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();

        //service.start();

        UiAutomator2Options  options = new UiAutomator2Options();
        options.setDeviceName("ShivamDevice");
        options.setApp("E:\\Appium\\Appium_project\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        //actual automation
        //Xpath, id, accessibilityId, classname, androidUIAutomator
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.quit();
        //stop the server
        service.stop();

    }
}
