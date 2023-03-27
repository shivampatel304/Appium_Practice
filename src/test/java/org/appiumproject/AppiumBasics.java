package org.appiumproject;


import io.appium.java_client.android.*;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {
        UiAutomator2Options  options = new UiAutomator2Options();
        options.setDeviceName("ShivamDevice");
        options.setApp("E:\\Appium\\Appium_project\\src\\test\\java\\resources\\ApiDemos-debug.apk");
        
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);


    }
}
