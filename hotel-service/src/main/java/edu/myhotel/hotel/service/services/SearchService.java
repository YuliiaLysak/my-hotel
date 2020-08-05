package edu.myhotel.hotel.service.services;

import edu.myhotel.hotel.service.storage.Room;
import edu.myhotel.hotel.service.storage.StayingPolicy;
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

    public RoomDetailInfo getRoomDetailInfo(int roomId) {
        if (roomId >= 1 && roomId <= 7) {
            Room neededRoom = dataStorage.getRoomById(roomId);

            RoomDetailInfo roomDetailInfo = new RoomDetailInfo();
            roomDetailInfo.setId(neededRoom.getId());
            roomDetailInfo.setName(neededRoom.getName());
            roomDetailInfo.setType(neededRoom.getType());
            roomDetailInfo.setPrimaryImage(neededRoom.getPrimaryImage());
            roomDetailInfo.setImages(neededRoom.getImages());
            roomDetailInfo.setPrice(neededRoom.getPrice());
            roomDetailInfo.setFacilities(neededRoom.getFacilities());
            roomDetailInfo.setCheckInPolicy(StayingPolicy.CHECK_IN.getDescription());
            roomDetailInfo.setCheckOutPolicy(StayingPolicy.CHECK_OUT.getDescription());

            return roomDetailInfo;
        } else {
            throw new RoomNotFoundException("Room not found for id = " + roomId);
        }
    }
}
