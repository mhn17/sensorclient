package de.hammerton.sensorClient.models;

public class ImageImpl implements Image {

    private final int id;
    private String name;

    public ImageImpl(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
