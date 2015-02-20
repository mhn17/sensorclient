package de.hammerton.sensorClient.application.activities;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.GridView;

import de.hammerton.sensorClient.R;
import de.hammerton.sensorClient.application.adapters.ImageAdapter;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private GridView gridView;
    private ImageAdapter imageAdapter;

    public static final int IMAGE_ADAPTER_COUNT = 22;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);

        MainActivity mainActivity = getActivity();
        this.gridView = (GridView) mainActivity.findViewById(R.id.galleryGridView);

        // ToDo use ImageAdapter with test data
        this.imageAdapter = (ImageAdapter) this.gridView.getAdapter();
    }

    public void testPreConditions() {
        assertTrue(this.gridView.getOnItemClickListener() != null);
        assertNotNull(this.imageAdapter);
        assertTrue(this.imageAdapter.getCount() == IMAGE_ADAPTER_COUNT);
    }
}