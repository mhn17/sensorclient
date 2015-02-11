package de.hammerton.sensorClient;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.hammerton.sensorClient.activities.BaseActionBarActivity;
import de.hammerton.sensorClient.activities.MainActivity;
import de.hammerton.sensorClient.activities.SingleImageActivity;
import de.hammerton.sensorClient.adapters.ImageAdapter;

@Module(
        injects = {
                MainActivity.class,
                SingleImageActivity.class,
                ImageAdapter.class
        },
        addsTo = AndroidModule.class,
        library = true
)
public class ActionBarActivityModule {
    private final BaseActionBarActivity activity;

    public ActionBarActivityModule(BaseActionBarActivity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    @ForActivity
    public Context provideActivityContext() {
        return activity;
    }
}
