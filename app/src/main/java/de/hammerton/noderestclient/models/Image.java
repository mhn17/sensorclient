package de.hammerton.noderestclient.models;

public class Image {

    private final int id;
    private String name;

    public Image(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
