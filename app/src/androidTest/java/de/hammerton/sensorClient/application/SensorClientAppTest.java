package de.hammerton.sensorClient.application;

import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.MediumTest;

public class SensorClientAppTest extends ApplicationTestCase<SensorClientApp> {
    public SensorClientAppTest() {
        super(SensorClientApp.class);
    }

    /**
     * Test application start up
     */
    @MediumTest
    public void testOnCreate() {
        createApplication();
    }

}