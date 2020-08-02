package edu.myhotel.hotel.service.storage;

import edu.myhotel.hotel.service.services.DataStorage;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataStorageStub implements DataStorage {
    private List<Room> rooms = new ArrayList<>();
    private List<BookedRoom> bookedRooms = new ArrayList<>();

    {
        Room room1 = new Room();
        room1.setId(1);
        room1.setType(RoomType.SINGLE);
        room1.setName("Monday");
        room1.setPrice(1000);
        room1.setImage("https://via.placeholder.com/100");
        room1.setFacilities(List.of(RoomFacility.SINGLE_BED, RoomFacility.SAFE,
                                    RoomFacility.SHOWER, RoomFacility.TOWELS,
                                    RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                                    RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room2 = new Room();
        room2.setId(2);
        room2.setType(RoomType.TWIN);
        room2.setName("Tuesday");
        room2.setPrice(1400);
        room2.setImage("https://via.placeholder.com/100");
        room2.setFacilities(List.of(RoomFacility.TWIN_BED, RoomFacility.TWIN_BED,
                                    RoomFacility.SAFE, RoomFacility.SHOWER,
                                    RoomFacility.TOWELS, RoomFacility.WIFI,
                                    RoomFacility.AIR_CONDITION, RoomFacility.TEAPOT,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room3 = new Room();
        room3.setId(3);
        room3.setType(RoomType.TWIN);
        room3.setName("Wednesday");
        room3.setPrice(1400);
        room3.setImage("https://via.placeholder.com/100");
        room3.setFacilities(List.of(RoomFacility.TWIN_BED, RoomFacility.TWIN_BED,
                                    RoomFacility.SAFE, RoomFacility.SHOWER,
                                    RoomFacility.TOWELS, RoomFacility.WIFI,
                                    RoomFacility.AIR_CONDITION, RoomFacility.TEAPOT,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room4 = new Room();
        room4.setId(4);
        room4.setType(RoomType.DOUBLE);
        room4.setName("Thursday");
        room4.setPrice(1400);
        room4.setImage("https://via.placeholder.com/100");
        room4.setFacilities(List.of(RoomFacility.DOUBLE_BED, RoomFacility.SAFE,
                                    RoomFacility.BATHTUB, RoomFacility.TOWELS,
                                    RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                                    RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room5 = new Room();
        room5.setId(5);
        room5.setType(RoomType.DOUBLE);
        room5.setName("Friday");
        room5.setPrice(1400);
        room5.setImage("https://via.placeholder.com/100");
        room5.setFacilities(List.of(RoomFacility.DOUBLE_BED, RoomFacility.SAFE,
                                    RoomFacility.BATHTUB, RoomFacility.TOWELS,
                                    RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                                    RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room6 = new Room();
        room6.setId(6);
        room6.setType(RoomType.QUAD);
        room6.setName("Saturday");
        room6.setPrice(2400);
        room6.setImage("https://via.placeholder.com/100");
        room6.setFacilities(List.of(RoomFacility.DOUBLE_BED, RoomFacility.TWIN_BED,
                                    RoomFacility.TWIN_BED,RoomFacility.SAFE,
                                    RoomFacility.BATHTUB, RoomFacility.SHOWER, RoomFacility.TOWELS,
                                    RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                                    RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        Room room7 = new Room();
        room7.setId(7);
        room7.setType(RoomType.SUITE);
        room7.setName("Sunday");
        room7.setPrice(3000);
        room7.setImage("https://via.placeholder.com/100");
        room7.setFacilities(List.of(RoomFacility.DOUBLE_BED, RoomFacility.DOUBLE_BED,
                                    RoomFacility.TWIN_BED, RoomFacility.TWIN_BED, RoomFacility.SAFE,
                                    RoomFacility.BATHTUB, RoomFacility.SHOWER, RoomFacility.TOWELS,
                                    RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                                    RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                                    RoomFacility.IRON, RoomFacility.HAIRDRYER,
                                    RoomFacility.MINIBAR, RoomFacility.TV));

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);
    }

    @Override
    public List<Room> findAvailableRooms(LocalDate checkIn, LocalDate checkOut) {
        return rooms;
    }

    public List<BookedRoom> findBookedRooms() {
        return bookedRooms;
    }

    public void bookRoom(int roomId, LocalDate checkIn, LocalDate checkOut) {
        bookedRooms.add(new BookedRoom(roomId, checkIn, checkOut));
    }
}
