package com.automation.pages;

import com.automation.drivers.DriverFactory;
import io.appium.java_client.AppiumBy;

public class HomePage {

    public boolean isAccessibilityVisible() {
        return DriverFactory.getDriver()
                .findElement(AppiumBy.accessibilityId("Accessibility"))
                .isDisplayed();
    }
}
