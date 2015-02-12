package de.hammerton.sensorClient.activities;

import android.test.ActivityInstrumentationTestCase2;

public class SingleImageActivityTest extends ActivityInstrumentationTestCase2<SingleImageActivity> {

    public SingleImageActivityTest() {
        super(SingleImageActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);


    }
}