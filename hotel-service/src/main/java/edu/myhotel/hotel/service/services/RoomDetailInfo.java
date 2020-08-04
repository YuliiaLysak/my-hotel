package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.RoomFacility;
import edu.myhotel.hotel.service.storage.RoomType;

import java.util.List;

public class RoomDetailInfo {
    private int id;
    private String name;
    private RoomType type;
    private String primaryImage;
    private List<String> images;
    private double price;
    private List<RoomFacility> facilities;
    private String checkInPolicy;
    private String checkOutPolicy;

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

    public String getPrimaryImage() {
        return primaryImage;
    }

    public void setPrimaryImage(String primaryImage) {
        this.primaryImage = primaryImage;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<RoomFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<RoomFacility> facilities) {
        this.facilities = facilities;
    }

    public String getCheckInPolicy() {
        return checkInPolicy;
    }

    public void setCheckInPolicy(String checkInPolicy) {
        this.checkInPolicy = checkInPolicy;
    }

    public String getCheckOutPolicy() {
        return checkOutPolicy;
    }

    public void setCheckOutPolicy(String checkOutPolicy) {
        this.checkOutPolicy = checkOutPolicy;
    }
}
