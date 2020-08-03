package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.Room;

import java.time.LocalDate;
import java.util.List;

public interface DataStorage {

    List<Room> findAvailableRooms(LocalDate checkIn, LocalDate checkOut);
}
