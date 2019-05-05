package com.example.garalley2;

/**
 * Created by Quoc Nguyen on 13-Dec-16.
 */

public class Item {
    private int id;
    private String name;
    private String type;
    private byte[] image;

    public Item(String name, String price, byte[] image, int id) {
        this.name = name;
        this.type = price;
        this.image = image;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
