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
        room1.setPrimaryImage("https://via.placeholder.com/100");
        room1.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room1.setFacilities(List.of(
                RoomFacility.SINGLE_BED, RoomFacility.SAFE,
                RoomFacility.SHOWER, RoomFacility.TOWELS,
                RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room2 = new Room();
        room2.setId(2);
        room2.setType(RoomType.TWIN);
        room2.setName("Tuesday");
        room2.setPrice(1400);
        room2.setPrimaryImage("https://via.placeholder.com/100");
        room2.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room2.setFacilities(List.of(
                RoomFacility.TWIN_BED, RoomFacility.TWIN_BED,
                RoomFacility.SAFE, RoomFacility.SHOWER,
                RoomFacility.TOWELS, RoomFacility.WIFI,
                RoomFacility.AIR_CONDITION, RoomFacility.TEAPOT,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room3 = new Room();
        room3.setId(3);
        room3.setType(RoomType.TWIN);
        room3.setName("Wednesday");
        room3.setPrice(1400);
        room3.setPrimaryImage("https://via.placeholder.com/100");
        room3.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room3.setFacilities(List.of(
                RoomFacility.TWIN_BED, RoomFacility.TWIN_BED,
                RoomFacility.SAFE, RoomFacility.SHOWER,
                RoomFacility.TOWELS, RoomFacility.WIFI,
                RoomFacility.AIR_CONDITION, RoomFacility.TEAPOT,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room4 = new Room();
        room4.setId(4);
        room4.setType(RoomType.DOUBLE);
        room4.setName("Thursday");
        room4.setPrice(1400);
        room4.setPrimaryImage("https://via.placeholder.com/100");
        room4.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room4.setFacilities(List.of(
                RoomFacility.DOUBLE_BED, RoomFacility.SAFE,
                RoomFacility.BATHTUB, RoomFacility.TOWELS,
                RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room5 = new Room();
        room5.setId(5);
        room5.setType(RoomType.DOUBLE);
        room5.setName("Friday");
        room5.setPrice(1400);
        room5.setPrimaryImage("https://via.placeholder.com/100");
        room5.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room5.setFacilities(List.of(
                RoomFacility.DOUBLE_BED, RoomFacility.SAFE,
                RoomFacility.BATHTUB, RoomFacility.TOWELS,
                RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room6 = new Room();
        room6.setId(6);
        room6.setType(RoomType.QUAD);
        room6.setName("Saturday");
        room6.setPrice(2400);
        room6.setPrimaryImage("https://via.placeholder.com/100");
        room6.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room6.setFacilities(List.of(
                RoomFacility.DOUBLE_BED, RoomFacility.TWIN_BED,
                RoomFacility.TWIN_BED, RoomFacility.SAFE,
                RoomFacility.BATHTUB, RoomFacility.SHOWER, RoomFacility.TOWELS,
                RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        Room room7 = new Room();
        room7.setId(7);
        room7.setType(RoomType.SUITE);
        room7.setName("Sunday");
        room7.setPrice(3000);
        room7.setPrimaryImage("https://via.placeholder.com/100");
        room7.setImages(List.of(
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500",
                "https://via.placeholder.com/500"
        ));
        room7.setFacilities(List.of(
                RoomFacility.DOUBLE_BED, RoomFacility.DOUBLE_BED,
                RoomFacility.TWIN_BED, RoomFacility.TWIN_BED, RoomFacility.SAFE,
                RoomFacility.BATHTUB, RoomFacility.SHOWER, RoomFacility.TOWELS,
                RoomFacility.WIFI, RoomFacility.AIR_CONDITION,
                RoomFacility.TEAPOT, RoomFacility.COFFEE_MACHINE,
                RoomFacility.IRON, RoomFacility.HAIRDRYER,
                RoomFacility.MINIBAR, RoomFacility.TV
        ));

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);

        BookedRoom bookedRoom1 = new BookedRoom(2,
                LocalDate.of(2020, 8, 7),
                LocalDate.of(2020, 8, 9)
        );

        BookedRoom bookedRoom2 = new BookedRoom(5,
                LocalDate.of(2020, 8, 21),
                LocalDate.of(2020, 8, 24)
        );

        BookedRoom bookedRoom3 = new BookedRoom(5,
                LocalDate.of(2020, 8, 28),
                LocalDate.of(2020, 9, 4)
        );

        BookedRoom bookedRoom4 = new BookedRoom(7,
                LocalDate.of(2020, 10, 23),
                LocalDate.of(2020, 10, 31)
        );

        bookedRooms.add(bookedRoom1);
        bookedRooms.add(bookedRoom2);
        bookedRooms.add(bookedRoom3);
        bookedRooms.add(bookedRoom4);
    }

    @Override
    public List<Room> findAvailableRooms(LocalDate checkIn, LocalDate checkOut) {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            int currentRoomId = room.getId();
            boolean isAvailable = true;
            List<BookedRoom> currentBookings = new ArrayList<>();
            for (BookedRoom bookedRoom : bookedRooms) {
                if (currentRoomId == bookedRoom.getRoomId()) {
                    currentBookings.add(bookedRoom);
                }
            }
            for (BookedRoom currentBooking : currentBookings) {
                if (isDateOverlapping(
                        currentBooking.getCheckIn(),
                        currentBooking.getCheckOut(),
                        checkIn,
                        checkOut)) {
                    isAvailable = false;
                    break;
                }
            }
            if (isAvailable) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    private boolean isDateOverlapping(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
        return start2.isBefore(end1) && end2.isAfter(start1);
    }

    public List<BookedRoom> findBookedRooms() {
        return bookedRooms;
    }

    public void bookRoom(int roomId, LocalDate checkIn, LocalDate checkOut) {
        bookedRooms.add(new BookedRoom(roomId, checkIn, checkOut));
    }

    @Override
    public Room getRoomById(int roomId) {
        Room current = new Room();
        for (Room room : rooms) {
            if (roomId == room.getId()) {
                current = room;
                break;
            }
        }
        return current;
    }
}
