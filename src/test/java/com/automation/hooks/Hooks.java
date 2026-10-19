package com.automation.hooks;

import com.automation.drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setUp() throws Exception {
        DriverFactory.startDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.stopDriver();
    }
}
