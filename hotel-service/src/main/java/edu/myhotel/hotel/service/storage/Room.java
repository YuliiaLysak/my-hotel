package edu.myhotel.hotel.service.storage;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter @Setter
public class Room {
    private int id;
    private RoomType type;
    private String name;
    private double price;
    private String primaryImage;
    private List<String> images;
    private List<RoomFacility> facilities;
}
