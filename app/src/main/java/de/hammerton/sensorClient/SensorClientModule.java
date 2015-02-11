package de.hammerton.sensorClient;

import dagger.Module;
import de.hammerton.sensorClient.models.ImageFactory;

@Module(
        injects = {
                ImageFactory.class
        },
        addsTo = ActionBarActivityModule.class,
        library = true
)
public class SensorClientModule {

}
