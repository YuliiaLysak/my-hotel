package edu.myhotel.hotel.service.storage;

public enum StayingPolicy {
    CHECK_IN("Check-in time is any time after 2 pm. If you arrive earlier, the receptionist will be pleased " +
            "to store your luggage until your room is ready. Guest will be required to present his own valid credit/debit card " +
            "upon check-in along with a valid form of identification, especially if you have already prepaid by a credit card your " +
            "reservation before your arrival. Should you need to confirm an earlier arrival time than the hotel standard check-in time, " +
            "please contact the hotel directly in advance. If you plan to arrive earlier that the hotel’s check-in time and to want to " +
            "be sure you will get your room, then we suggest you to booked also the night before."
    ),
    CHECK_OUT("Check-out is at 12pm. If you require a later check-out, please contact the receptionist before 11 AM on the day " +
            "of departure and we will do our best to accommodate your request but we cannot guarantee that it would be possible. A charge may " +
            "be applied depending on availability. Any delay to checked-out will result an extra night being added to the final bill. " +
            "The Hotel can accommodate guest luggage complimentary at the reception after check-out time if needed.");

    private final String description;

    StayingPolicy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
