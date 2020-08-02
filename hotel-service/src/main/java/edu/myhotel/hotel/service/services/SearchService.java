package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.Room;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class SearchService {
    private final DataStorage dataStorage;

    public SearchService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public SearchResult searchAvailableRoom(LocalDate checkIn, LocalDate checkOut) {
        if (LocalDate.now().isAfter(checkIn) || LocalDate.now().isAfter(checkOut) || checkIn.isAfter(checkOut)) {
            throw new InvalidDateException("Invalid date");
        }

        List<Room> availableRooms = dataStorage.findAvailableRooms(checkIn, checkOut);
        return new SearchResult(availableRooms, checkIn, checkOut);
    }
}
