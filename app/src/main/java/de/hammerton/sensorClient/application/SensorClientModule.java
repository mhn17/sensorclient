package de.hammerton.sensorClient.application;

import dagger.Module;
import de.hammerton.sensorClient.application.models.ImageFactory;

@Module(
        injects = {
                ImageFactory.class
        },
        addsTo = ActionBarActivityModule.class,
        library = true
)
public class SensorClientModule {

}
