package edu.myhotel.hotel.service.storage;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class BookedRoom {
    private int roomId;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public BookedRoom(int roomId, LocalDate checkIn, LocalDate checkOut) {
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
