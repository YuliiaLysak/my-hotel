package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.Room;

import java.time.LocalDate;
import java.util.List;

public class SearchResult {
    private List<Room> availableRooms;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public SearchResult(List<Room> availableRooms, LocalDate checkIn, LocalDate checkOut) {
        this.availableRooms = availableRooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(List<Room> availableRooms) {
        this.availableRooms = availableRooms;
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
