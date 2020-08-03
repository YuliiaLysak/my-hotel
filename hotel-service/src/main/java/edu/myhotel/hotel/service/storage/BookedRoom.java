package edu.myhotel.hotel.service.storage;

import java.time.LocalDate;

public class BookedRoom {
    private int roomId;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public BookedRoom(int roomId, LocalDate checkIn, LocalDate checkOut) {
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
}
