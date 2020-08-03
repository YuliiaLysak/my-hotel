package edu.myhotel.hotel.service.storage;

import java.util.List;

public class Room {
    private int id;
    private RoomType type;
    private String name;
    private double price;
    private String image;
    private List<RoomFacility> facilities;

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

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<RoomFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<RoomFacility> facilities) {
        this.facilities = facilities;
    }
}
