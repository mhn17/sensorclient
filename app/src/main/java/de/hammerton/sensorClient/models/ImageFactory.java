package de.hammerton.sensorClient.models;

import javax.inject.Inject;

public class ImageFactory {

    @Inject
    public ImageFactory() {
    }

    public Image create(int id, String name) {
        return new ImageImpl(id, name);
    }

}
