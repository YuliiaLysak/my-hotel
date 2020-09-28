package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.Room;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class SearchResult {
    private List<Room> availableRooms;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public SearchResult(List<Room> availableRooms, LocalDate checkIn, LocalDate checkOut) {
        this.availableRooms = availableRooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
