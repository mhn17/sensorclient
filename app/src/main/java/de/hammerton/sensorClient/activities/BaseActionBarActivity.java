package de.hammerton.sensorClient.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;
import de.hammerton.sensorClient.ActionBarActivityModule;
import de.hammerton.sensorClient.SensorClientApp;

public abstract class BaseActionBarActivity extends ActionBarActivity {
    private ObjectGraph activityGraph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // create activity object graph and add activity specific modules
        SensorClientApp application = (SensorClientApp) getApplication();
        this.activityGraph = application.getApplicationGraph().plus(this.getModules().toArray());
        this.activityGraph.inject(this);
    }

    @Override
    protected void onDestroy() {
        this.activityGraph = null;

        super.onDestroy();
    }

    protected List<Object> getModules() {
        return Arrays.<Object>asList(new ActionBarActivityModule(this));
    }

    public void inject(Object object) {
        this.activityGraph.inject(object);
    }
}
