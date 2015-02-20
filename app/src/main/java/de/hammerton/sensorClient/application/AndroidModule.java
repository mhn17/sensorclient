package de.hammerton.sensorClient.application;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        library = true
)
public class AndroidModule {
    private final SensorClientApp application;

    public AndroidModule(SensorClientApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ForApplication
    public Context provideApplicationContext() {
        return this.application;
    }
}
