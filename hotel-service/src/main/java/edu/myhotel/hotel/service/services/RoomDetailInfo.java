package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.RoomFacility;
import edu.myhotel.hotel.service.storage.RoomType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
}
